package com.shamwow.brainz;

/**
 * Created by AngeloDesktop on 17/02/2017.
 */

class CiscoQuestionLibrary {

    private final String[] CiscoListQuestion = {"1. In what class does this IP address belong to? 170.20.0.1",
            "2. What is the purpose of the Data Link?",
            "3. In the CIDR notation, what subnet mask does /27 represent?",
            "4. What is MTU?",
            "5. What is HDLC?",
            "6. What is the \"magic\" command to reverse the changes or command entered in the global configuration?",
            "7. What is the shortcut key (Windows) command for exiting a mode?",
            "8. 255.0.224.0 is a valid is an invalid subnet mask, how should it be written?",
            "9. Which type of connector does a NIC use?",
            "10. What is the 6th osi layer?",
            ""};

    private final String[][] CiscoListChoices =
            {
                    {"Class A",
                            "Class B",
                            "Class C"},

                    {"The job of the Data Link layer is to check messages are sent to the right device.",
                            "The job of the Data Link layer is to answer messages are sent to the right device.",
                            "The job of the Data Link layer is to transfer messages to the right device."},

                    {"255.255.255.128",
                            "255.255.255.240",
                            "255.255.255.224"},

                    {"Maximum Transfer Unit",
                            "Minimum Transmission Unit",
                            "Maximum Transmission Unit"},

                    {"High Level Data Link Control",
                            "Higher Level Data Link Control",
                            "High Level Data Linking Control"},

                    {"disble", "no", "erase"},
                    {"Ctrl + Z", "ALT + F4", "Ctrl + C"},
                    {"224.255.0.0", "255.0.0.0", "None of the above"},
                    {"RJ-45", "RJ-11", "PS-2"},
                    {"Network", "Presentation", "Transport"},
                    {"", "", ""}

            };


    private final String[] CiscoCorrectAnswers = {"Class B",
            "The job of the Data Link layer is to check messages are sent to the right device.",
            "255.255.255.224",
            "Maximum Transmission Unit",
            "High Level Data Link Control",
            "no",
            "Ctrl + C",
            "224.255.0.0",
            "RJ-45",
            "Presentation",
            ""};

    public String getListQuestions(int a) {
        return CiscoListQuestion[a];
    }

    public String getChoicea(int a) {
        return CiscoListChoices[a][0];
    }

    public String getChoiceb(int a) {
        return CiscoListChoices[a][1];
    }

    public String getChoicec(int a) {
        return CiscoListChoices[a][2];
    }

    public String getCorrectAnswer(int a) {
        return CiscoCorrectAnswers[a];
    }


}






