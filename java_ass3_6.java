interface Speaker {
    void speak(String text);
}
interface Translator {
    void translate(String text,
                   String language);
}
class AIAssistant
        implements Speaker, Translator {
    @Override
    public void speak(String text) {
        System.out.println(
                "Speaking: " + text);
    }
    @Override
    public void translate(String text,
                          String language) {
        System.out.println(
                "Translating \"" +
                text +
                "\" to " +
                language);
    }
}
public class java_ass3_6 {
    public static void main(String[] args) {
        AIAssistant ai =
                new AIAssistant();
        ai.speak("Hello");
        ai.translate(
                "Good Morning",
                "Bengali");
    }
}