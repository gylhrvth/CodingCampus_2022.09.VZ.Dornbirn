package mase.week06;

public class FotoapparatObject {
    public static void main(String[] args) {
        Fotoapparat nikon = new Fotoapparat("Z 50", "Nikon", 20);
        Fotoapparat canon = new Fotoapparat("EOS R5", "Canon", 40);
        Objektiv obj = new Objektiv(10, 20, "z30", "canon");
        Speicherkarte sdkarte = new Speicherkarte(32, "San Disk");
        System.out.println(sdkarte);
        System.out.println(nikon);
        System.out.println(canon);
        takeaPhoto();
        System.out.println(obj);
    }

    public static void takeaPhoto() {
        System.out.println("                       _.-**-._\n");
        System.out.println("                    _,(        ),_\n");
        System.out.println("                 .-\"  '-^----'   \"-.\n");
        System.out.println("              .-'                    '-.\n");
        System.out.println("            .'                          '.\n");
        System.out.println("          .'    __.--**'\"\"\"\"\"\"'**--.__    '.\n");
        System.out.println("         /_.-*\"'__.--**'\"\"\"\"\"\"'**--.__'\"*-._\\\n");
        System.out.println("        /_..-*\"'   .-*\"*-.  .-*\"*-.   '\"*-.._\\\n");
        System.out.println("       :          /       ;:       \\          ;\n");
        System.out.println("       :         :     *  !!  *     :         ;\n");
        System.out.println("        \\        '.     .'  '.     .'        /\n");
        System.out.println("         \\         '-.-'      '-.-'         /\n");
        System.out.println("      .-*''.                              .'-.\n");
        System.out.println("   .-'      '.                          .'    '.\n");
        System.out.println("  :           '-.        _.._        .-'        '._\n");
        System.out.println(" ;\"*-._          '-._  --___ `   _.-'        _.*'  '*.\n");
        System.out.println(":      '.            `\"*-.__.-*\"`           (        :\n");
        System.out.println(" ;      ;                 *|                 '-.     ;\n");
        System.out.println("  '---*'                   |                    \"\"--'\n");
        System.out.println("   :                      *|                      :\n");
        System.out.println("   '.                      |                     .'\n");
        System.out.println("     '.._                 *|        ____----.._-'\n");
        System.out.println("      \\  \"\"\"----_____------'-----\"\"\"         /\n");
        System.out.println("       \\  __..-------.._        ___..---._  /\n");
        System.out.println("       :'\"              '-..--''          \"';\n");
        System.out.println("        '\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"' '\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\n");
        System.out.println("I`m not fat, I`m festively plump!");
    }
}
