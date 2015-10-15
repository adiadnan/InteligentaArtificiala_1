/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;

/**
 *
 * @author ADI
 */
public class IntelligenceHandler {
    
    private final String botReply = "The response of the bot: " ;
    
    private final String botName = "mybot";
    
    private final String path = "C:/example";
    
    private String sessionUser = "";
    
    private Bot bot;
    
    private Chat chatSession;
    
    public static IntelligenceHandler simpleAI(String sessionUser){
        
        return new IntelligenceHandler(sessionUser);
        
    }
    
    public static IntelligenceHandler simpleAI(){
     
        return new IntelligenceHandler();
        
    }
    
    public IntelligenceHandler(String sessionUser){
        
        setSessionUser(sessionUser);
        
        bot = new Bot(botName, path);
        
        chatSession = new Chat(bot);
        
    }
    
    public IntelligenceHandler(){
        
        bot = new Bot(botName, path);
        
        chatSession = new Chat(bot);
        
        
//        
//       
//        String request = "what is my job?";
//        
//        System.out.println(chatSession.multisentenceRespond(request));        
        
    }
    
    public void setSessionUser(String sessionUser){
        
        this.sessionUser = sessionUser;
        
    }
    
    public String getSessionUser(){
        
        return sessionUser;
        
    }
    
    /**
     * 
     * @param userInfo Information necessary when there will be a need to know which user is querying the bot.
     * @param request 
     */
    public String queryBot(String userInfo, String request){
        
        return chatSession().multisentenceRespond(request);
        
    }
    
    public String queryBot(String request){
        
        return chatSession().multisentenceRespond(request);
        
    }
    
    public Bot currentBot(){
        
        return bot;
        
    }
    
    public Chat chatSession(){
        
        return chatSession;
        
    }
    
    
}
