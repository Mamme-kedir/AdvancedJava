public class AlphaSet {
    static char ch ;
static void Detector()
{
if(Character.isLetter(ch)) 
    switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(ch + " is" + " Vowel");
            break;
    
        default:
        System.out.println(ch + "is" + "Consonant");
            break;
    }
    else
        System.out.println(ch + "is not letter");
}
public static void main(String[] args) {
    ch = Character.toLowerCase('I');
    Detector();
}
}
