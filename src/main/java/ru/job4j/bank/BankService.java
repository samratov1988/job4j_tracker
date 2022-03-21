package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * Метод ищет клиента по номеру паспорта
     * @param passport паспорт клиента типа String.
     * @return возвращает клиента типа User. Если клиента нет, то возвращает null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет клиента по номеру паспорта и реквизиту счета
     * @param passport паспорт клиента типа String.
     * @param requisite реквизиты счета типа String.
     * @return возвращает счет клиента типа Account,
     * если по номеру паспорта есть клиент и по реквизитам есть его счет в системе,
     * иначе возвращает null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account: users.get(user)) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
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
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null) {
            if (src.getBalance() >= amount) {
                src.setBalance(src.getBalance() - amount);
                dest.setBalance(dest.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
