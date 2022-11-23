package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает простейшие операции для банка
 * @author SAMAT SAMRATOV
 * @version 1.0
 */

public class BankService {
    /**
     * Хранение данных о всех клиентах банка с привязанными к ним счетах
     * осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового клиента в систему.
     * Если клиент есть в системе, то добавление не осуществляется
     * @param user клиент банка типа User
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет, если клиент уже есть и еще нет этого счета в системе
     * @param passport паспорт клиента типа String.
     * @param account новый счет типа Account.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * Метод ищет клиента по номеру паспорта
     * @param passport паспорт клиента типа String.
     * @return возвращает клиента типа User. Если клиента нет, то возвращает null
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет клиента по номеру паспорта и реквизиту счета
     * @param passport паспорт клиента типа String.
     * @param requisite реквизиты счета типа String.
     * @return возвращает счет клиента типа Account,
     * если по номеру паспорта есть клиент и по реквизитам есть его счет в системе,
     * иначе возвращает null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return  users.get(user.get())
                    .stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод переводит деньги со счета клиента на счет другого клиента
     * @param srcPassport паспорт отправителя типа String.
     * @param srcRequisite реквизиты счета отправителя типа String.
     * @param destPassport паспорт получателя типа String.
     * @param destRequisite реквизиты счета получателя типа String.
     * @param amount сумма перевода типа double
     * @return возвращает true, если счёта клиентов найдены и хватает денег на счёте отправителя,
     * иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent()) {
            if (src.get().getBalance() >= amount) {
                src.get().setBalance(src.get().getBalance() - amount);
                dest.get().setBalance(dest.get().getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
