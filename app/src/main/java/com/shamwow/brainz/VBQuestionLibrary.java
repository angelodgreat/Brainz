package com.shamwow.brainz;

/**
 * Created by AngeloDesktop on 20/02/2017.
 */

class VBQuestionLibrary {

    private final String[] VBQuestion = {"1. What happens to the string Letter variable after applying .ToUpper?",
                                   "2. If the strClasslist variable contains the string “Raymond Perlta”, what will the strClasslist.IndexOf('Umali', 2)                                        method return?",
                                    "3. What does DLR stands for?",
                                    "4. ____ is a method of defining some parts of a class in one file and then adding more definitions later; particularly useful for integrating user code with auto-generated code.",
                                    "5. ____ are useful if you have a fixed sized collection, and the size will never change.",
                                    ""};

    private final String[][] VBChoices  = {
            {"LETTER","Letter","lETTER"},
            {"–1","3","4"},
            {"Dynamic Language Rendering","Doing Long Run","Dynamic Language Runtime"},
            {"Public Class","Partial Classes","Classful"},
            {"2-dimentional Array","ArrayList","Array"},
            {"","",""}
    };

    private final String[] VBCorrectAnswer={
            "LETTER",
            "-1",
            "Dynamic Language Runtime",
            "Partial Classes",
            "Array",
            ""
    };

    public String VBgetListQuestions(int a) {
        return VBQuestion[a];
    }

    public String VBgetChoicea(int a) {
        return VBChoices[a][0];
    }

    public String VBgetChoiceb(int a) {
        return VBChoices[a][1];
    }

    public String VBgetChoicec(int a) {
        return VBChoices[a][2];
    }

    public String VBgetCorrectAnswer(int a) {
        return VBCorrectAnswer[a];
    }

}
