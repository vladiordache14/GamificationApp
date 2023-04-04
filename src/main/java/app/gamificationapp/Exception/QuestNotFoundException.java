package app.gamificationapp.Exception;

import app.gamificationapp.Model.Quest;

public class QuestNotFoundException extends RuntimeException{
    public QuestNotFoundException(String msg){
        super(msg);
    }
}
