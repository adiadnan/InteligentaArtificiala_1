/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteligentaartificiala_1;

import UserInterface.DefaultGUI;
import chatbot.IntelligenceHandler;
import org.alicebot.ab.*;

/**
 *
 * @author ADI
 */
public class InteligentaArtificiala_1 {

    /**
     * @param args the command line arguments
     */
    private IntelligenceHandler ai_a;
    private IntelligenceHandler ai_b;
    private DefaultGUI a;
    private DefaultGUI b;
    
    public static InteligentaArtificiala_1 defaultLaunchProgram(){
        
        return new InteligentaArtificiala_1();
        
    }

    public InteligentaArtificiala_1() {

        initBot();
        initPlatform();

    }
    
    public final void initBot(){
        
        ai_a = IntelligenceHandler.simpleAI("A_side");
        ai_b = IntelligenceHandler.simpleAI("B_side");
        
    }

    public final void initPlatform() {

        a = DefaultGUI.customGUI(this, "A_side");

        b = DefaultGUI.customGUI(this, "B_side");

        a.setVisible(true);

        b.setVisible(true);

    }
    
    public IntelligenceHandler getBot(String sessionUser){
        
        if(sessionUser.equals("A_side")){
            
            return getFirstBot();
            
        } else if(sessionUser.equals("B_side")){
            
            return getSecondBot();
            
        }
        
        return null;
        
    }
    
    public IntelligenceHandler getFirstBot(){
        
        return this.ai_a;
        
    }
    
    public IntelligenceHandler getSecondBot(){
        
        return this.ai_b;
        
    }

//    public void updateMessageBoard(){
//        
//        a.write(DefaultGUI.getMessageBoard());
//        b.write(DefaultGUI.getMessageBoard());
//        
//    }
    public static void main(String[] args) {
        // TODO code application logic here

        InteligentaArtificiala_1 i = InteligentaArtificiala_1.defaultLaunchProgram();

        System.out.println("Hello world, again!");

    }

}
