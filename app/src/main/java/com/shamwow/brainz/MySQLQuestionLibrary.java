package com.shamwow.brainz;

/**
 * Created by AngeloDesktop on 20/02/2017.
 */

class MySQLQuestionLibrary {

    private final String[] MySQLQuestion = {"1. A ____ is a question or a request.",
            "2. Close MySQL connection",
            "3. What does PDO stands for",
            "4. The ____ statement is used to create a database in MySQL.",
            "5. MySQL is the world's most popular open source ____",
            "",};

    private final String[][] MySQLChoices = {
            {"Expansion", "Query", "Extension"},
            {"mysql_escape_string", "mysql_close", "mysql_connect"},
            {"Presenting Direct Objection", "Payment Deposit Office", "PHP Data Objects"},
            {"CREATE DATABASE", "CREATE", "CREATE TABLE"},
            {"Database", "Website", "System"},
            {"", "", ""},
    };

    private final String[] MySQLCorrectAnswer = {
            "Query",
            "mysql_close",
            "PHP Data Objects",
            "CREATE DATABASE",
            "Database",
            "",
    };

    public String MySQLgetListQuestions(int a) {
        return MySQLQuestion[a];
    }

    public String MySQLgetChoicea(int a) {
        return MySQLChoices[a][0];
    }

    public String MySQLgetChoiceb(int a) {
        return MySQLChoices[a][1];
    }

    public String MySQLgetChoicec(int a) {
        return MySQLChoices[a][2];
    }

    public String MySQLgetCorrectAnswer(int a) {
        return MySQLCorrectAnswer[a];
    }
}
