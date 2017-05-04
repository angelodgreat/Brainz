package com.shamwow.brainz;

/**
 * Created by AngeloDesktop on 20/02/2017.
 */

class CompEssentialsQuestionLibrary {

    private final String[] CompEssentialsQuestion = {
            "1. Which one of the following would be described as software?",
            "2. A laptop is mst likely to have which one of the following input devices ftted as standard",
            "3. Which one of the following is the cpu in a computer",
            "4. Which one of the following describes window xp",
            "5. Which one of the following is a kilobyte",
            "",};

    private final String[][] CompEssentialsChoices = {
            {"Printer", "Internet browser", "Keyboard"},
            {"Scanner", "Mouse", "Touchpad"},
            {"Control Process Unit", "Calculating Process Unit", "Central Processing Unit"},
            {"An operating system", "A database application", "A backup utility"},
            {"1000 bytes", "1024 bits", "1024 bytes"},
            {"", "", ""},
    };

    private final String[] CompEssentialsCorrectAnswer = {
            "Internet browser",
            "Touchpad",
            "Central Processing Unit",
            "An operating system",
            "1024 bytes",
            "",
    };

    public String CompEssentialsgetListQuestions(int a) {
        return CompEssentialsQuestion[a];
    }

    public String CompEssentialsgetChoicea(int a) {
        return CompEssentialsChoices[a][0];
    }

    public String CompEssentialsgetChoiceb(int a) {
        return CompEssentialsChoices[a][1];
    }

    public String CompEssentialsgetChoicec(int a) {
        return CompEssentialsChoices[a][2];
    }

    public String CompEssentialsgetCorrectAnswer(int a) {
        return CompEssentialsCorrectAnswer[a];
    }
}
