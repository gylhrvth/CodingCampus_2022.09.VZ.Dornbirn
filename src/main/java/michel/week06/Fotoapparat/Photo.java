package michel.week06.Fotoapparat;


import java.text.SimpleDateFormat;
import java.util.*;

public class Photo {
    private final int id;
    private final int size; // in MB
    private final String motiv;

    public int getSize() { // ermöglicht abfrage - größe des Fotos
        return size;
    }
    private final String shootingDate;

    //========================================================================

    public Photo(int id, int size) {     // definiert die Größe + id von aufgenommenem Foto
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        GregorianCalendar calendar = new GregorianCalendar();
        String actualDate = date.format(calendar.getTime());
        this.id = id;
        shootingDate = actualDate;
        this.size = size;

        motiv = printPhoto();
    }

    public String toString() {       // ermöglicht den Ausdruck den in der Sd-Karte gespeicherten Fotos
        return "IMG-" + id + " Shooting Date: " + shootingDate + "\n" + motiv + "\n";
    }
    private String printPhoto() {
        String picture1 = """
                 ___  _  __  _____ _____ __  _ \s
                  ||  |  //\\  ||  | ||  | || | \s
                  ||--| ||--| ||--/ ||--/ \\\\/   \s
                  ||~~| ||~~| ||~~  ||~~  //   \s
                  ||  | ||  | ||    ||   ||     \s

                 ___ ___  _  __  ___  _ ___  _ ___  _ __  ___  _
                """;



        String picture2 = """
                                       ################################                                  \s
                                     #####################################                               \s
                                  ###########################################                            \s
                                #################################################                        \s
                              #####################################################                      \s
                            ##########################################################                   \s
                          ##############################################################                 \s
                         ###################################################################             \s
                        #####################################################################            \s
                       ########################################################################          \s
                      ###########################################################################        \s
                    ##############################'                   `############################      \s
                   #################'                                      `##########################   \s
                   ###############'                                           `########################  \s
                   #############'                                              `#######################  \s
                  ############.'                                                &######################  \s
                  ###########'                                                  &######################  \s
                 ###########3                                                   `######################  \s
                ############3                                                     `##################### \s
                ############3                                                      &#####################\s
                ############3                                                      &#####################\s
                ############3                                                      &######################
                ############3                                                      &######################
                ###########'                                                       `######################
                 ##########3                                                       &#####################\s
                     #####3                                 .#######.              `#################### \s
                      ####3  .##############.           .###############.           `##################  \s
                      ####3###################.      .#####################.         ##################  \s
                      #########################.     ########################.        ################   \s
                     ####' #######'  .---. `####     ########'  .---.  ########        ##############    \s
                     ####3  `##' .' / (#) \\ `##'      `###' .''/ (#) \\  ######'        #############     \s
                     ####3 `--'  `. \\     /.'  ;     ;      `. \\     /.' `----''       ############      \s
                     ####3   _.' `-_ `---''.-'             `-.  `---' .' ``---''       &##########       \s
                      ###3          -____-'                   `- ----'    `-._         &#########        \s
                       ##3      _---'''      ;                       -_                &#### `.#         \s
                       ##3     .'                                      `.             &####   :#         \s
                       ##`     '                                         `-.         &####    :          \s
                       ###`                 .                               `       &###    ) :          \s
                         #3                .            .                          &###       :          \s
                         #3               . ;        ;   .                        &###    _  .'          \s
                          #3              : :            :                        &##       :            \s
                          #3              `.             :                        ###      .'            \s
                           :                .       ##-  )   .                    ##      .:             \s
                           :           .'    `-__-~'   `'     .                   ##     : :             \s
                           :          .                        `.                   ~~~;~  ;             \s
                           `.        '                           `.                  .'    ;             \s
                            :       '                              `.              .'      :             \s
                            `.      :        _     _                :        .    .'       :             \s
                             :     :   _.- ~' `-.-' `--._           :      .'    .'        :             \s
                              ;    :  `---._____________.-.--'      :    .'    .'                        \s
                              `.       `.                .'             :     .'                         \s
                               `.        `._          _-'               ;    ;                           \s
                                :           ~~-----~~'                  :  .'                            \s
                                `.                                     .'  :                             \s
                                 :           _________                 :  .'                             \s
                                  `.                                   : :                               \s
                                    `.                               .'-'                                \s
                                     :                               :                                   \s
                                      `.                           .'                                    \s
                                       :`.                      .-'                                      \s
                                       : :         __        .'                                          \s
                                       :  `-------'  `------'                       \s""";
        String picture3 = """
                                    .+~                :xx++::
                                   :`. -          .!!X!~"?!`~!~!. :-:.
                                  {             .!!!H":.~ ::+!~~!!!~ `%X.
                                  '             ~~!M!!>!!X?!!!!!!!!!!...!~.
                                              {!:!MM!~:XM!!!!!!.:!..~ !.  `{
                                  {: `   :~ .:{~!!M!XXHM!!!X!XXHtMMHHHX!  ~ ~
                                ~~~~{' ~!!!:!!!!!XM!!M!!!XHMMMRMSXXX!!!!!!:  {`
                                  `{  {::!!!!!X!X?M!!M!!XMMMMXXMMMM??!!!!!?!:~{
                               : '~~~{!!!XMMH!!XMXMXHHXXXXM!!!!MMMMSXXXX!!!!!!!~
                            :    ::`~!!!MMMMXXXtMMMMMMMMMMMHX!!!!!!HMMMMMX!!!!!: ~
                               '~:~!!!!!MMMMMMMMMMMMMMMMMMMMMMXXX!!!M??MMMM!!X!!i:
                               {~{!!!!!XMMMMMMMMMMMM8M8MMMMM8MMMMMXX!!!!!!!!X!?t?!:
                               ~:~~!!!!?MMMMMM@M@RMRRR$@@MMRMRMMMMMMXSX!!!XMMMX{?X!
                             :XX {!!XHMMMM88MM88BR$M$$$$8@8RN88MMMMMMMMHXX?MMMMMX!!!
                           .:X! {XMSM8M@@$$$$$$$$$$$$$$$$$$$B8R$8MMMMMMMMMMMMMMMMX!X
                          :!?! !?XMMMMM8$$$$8$$$$$$$$$$$$$$BBR$$MMM@MMMMMMMMMMMMMM!!X
                        ~{!!~ {!!XMMMB$$$$$$$$$$$$$$$$$$$$$$$$MMR$8MR$MMMMMMMMMMMMM!?!:
                        :~~~ !:X!XMM8$$$$$$$$$$$$$$$$$$$$$$$RR$$MMMMR8NMMMMMMMMMMMMM{!`-
                    ~:{!:~`~':!:HMM8N$$$$$$$$$$$$$$$$$$$$$$$$$8MRMM8R$MRMMMMMMMMRMMMX!
                  !X!``~~   :~XM?SMM$B$$$$$$$$$$$$$$$$$$$$$$BR$$MMM$@R$M$MMMMMM$MMMMX?L
                 X~.      : `!!!MM#$RR$$$$$$$$$$$$$$$$$R$$$$$R$M$MMRRRM8MMMMMMM$$MMMM!?:
                 ! ~ {~  !! !!~`` :!!MR$$$$$$$$$$RMM!?!??RR?#R8$M$MMMRM$RMMMM8MM$MMM!M!:>
                : ' >!~ '!!  !   .!XMM8$$$$$@$$$R888HMM!!XXHWX$8$RM$MR5$8MMMMR$$@MMM!!!{ ~
                !  ' !  ~!! :!:XXHXMMMR$$$$$$$$$$$$$$$$8$$$$8$$$MMR$M$$$MMMMMM$$$MMM!!!!
                 ~{!!!  !!! !!HMMMMMMMM$$$$$$$$$$$$$$$$$$$$$$$$$$MMM$M$$MM8MMMR$$MMXX!!!!/:`
                  ~!!!  !!! !XMMMMMMMMMMR$$$$$$$$$$$$R$RRR$$$$$$$MMMM$RM$MM8MM$$$M8MMMX!!!!:
                  !~ ~  !!~ XMMM%!!!XMMX?M$$$$$$$$B$MMSXXXH?MR$$8MMMM$$@$8$M$B$$$$B$MMMX!!!!
                  ~!    !! 'XMM?~~!!!MMMX!M$$$$$$MRMMM?!%MMMH!R$MMMMMM$$$MM$8$$$$$$MR@M!!!!!
                  {>    !!  !Mf x@#"~!t?M~!$$$$$RMMM?Xb@!~`??MS$M@MMM@RMRMMM$$$$$$RMMMMM!!!!
                  !    '!~ {!!:!?M   !@!M{XM$$R5M$8MMM$! -XXXMMRMBMMM$RMMM@$R$BR$MMMMX??!X!!
                  !    '!  !!X!!!?::xH!HM:MM$RM8M$RHMMMX...XMMMMM$RMMRRMMMMMMM8MMMMMMMMX!!X!
                  !     ~  !!?:::!!!MXMR~!MMMRMM8MMMMMS!!M?XXMMMMM$$M$M$RMMMM8$RMMMMMMMM%X!!
                  ~     ~  !~~X!!XHMMM?~ XM$MMMMRMMMMMM@MMMMMMMMMM$8@MMMMMMMMRMMMMM?!MMM%HX!
                           !!!!XSMMXXMM .MMMMMMMM$$$BB8MMM@MMMMMMMR$RMMMMMMMMMMMMMMMXX!?H!XX
                           XHXMMMMMMMM!.XMMMMMMMMMR$$$8M$$$$$M@88MMMMMMMMMMMMMMM!XMMMXX!!!XM
                      ~   {!MMMMMMMMRM:XMMMMMMMMMM8R$$$$$$$$$$$$$$$NMMMMMMMM?!MM!M8MXX!!/t!M
                      '   ~HMMMMMMMMM~!MM8@8MMM!MM$$8$$$$$$$$$$$$$$8MMMMMMM!!XMMMM$8MR!MX!MM
                          'MMMMMMMMMM'MM$$$$$MMXMXM$$$$$$$$$$$$$$$$RMMMMMMM!!MMM$$$$MMMMM{!M
                          'MMMMMMMMM!'MM$$$$$RMMMMMM$$$$$$$$$$$$$$$MMM!MMMX!!MM$$$$$M$$M$M!M
                           !MMMMMM$M! !MR$$$RMM8$8MXM8$$$$$$$$$$$$NMMM!MMM!!!?MRR$$RXM$$MR!M
                           !M?XMM$$M.{ !MMMMMMSUSRMXM$8R$$$$$$$$$$#$MM!MMM!X!t8$M$MMMHMRMMX$
                    ,-,   '!!!MM$RMSMX:.?!XMHRR$RM88$$$8M$$$$$R$$$$8MM!MMXMH!M$$RMMMMRNMMX!$
                   -'`    '!!!MMMMMMMMMM8$RMM8MBMRRMR8RMMM$$$$8$8$$$MMXMMMMM!MR$MM!M?MMMMMM$
                          'XX!MMMMMMM@RMM$MM@$$BM$$$M8MMMMR$$$$@$$$$MM!MMMMXX$MRM!XH!!??XMMM
                          `!!!M?MHMMM$RMMMR@$$$$MR@MMMM8MMMM$$$$$$$WMM!MMMM!M$RMM!!.MM!%M?~!
                           !!!!!!MMMMBMM$$RRMMMR8MMMMMRMMMMM8$$$$$$$MM?MMMM!f#RM~    `~!!!~!
                           ~!!HX!!~!?MM?MMM??MM?MMMMMMMMMRMMMM$$$$$MMM!MMMM!!
                           '!!!MX!:`~~`~~!~~!!!!XM!!!?!?MMMM8$$$$$MMMMXMMM!!
                            !!~M@MX.. {!!X!!!!XHMHX!!``!XMMMB$MM$$B$M!MMM!!
                            !!!?MRMM!:!XHMHMMMMMMMM!  X!SMMX$$MM$$$RMXMMM~
                             !M!MMMM>!XMMMMMMMMXMM!!:!MM$MMMBRM$$$$8MMMM~
                             `?H!M$R>'MMMM?MMM!MM6!X!XM$$$MM$MM$$$$MX$f
                              `MXM$8X MMMMMMM!!MM!!!!XM$$$MM$MM$$$RX@"
                               ~M?$MM !MMMMXM!!MM!!!XMMM$$$8$XM$$RM!`
                                !XMMM !MMMMXX!XM!!!HMMMM$$$$RH$$M!~
                                'M?MM `?MMXMM!XM!XMMMMM$$$$$RM$$#
                                 `>MMk ~MMHM!XM!XMMM$$$$$$BRM$M"
                                  ~`?M. !M?MXM!X$$@M$$$$$$RMM#
                                    `!M  !!MM!X8$$$RM$$$$MM#`
                                      !% `~~~X8$$$$8M$$RR#`
                                       !!x:xH$$$$$$$R$R*`
                                        ~!?MMMMRRRM@M#`      \s
                                         `~???MMM?M"`
                                             ``~~""";
        String picture4 = """
                                        .-.
                                _.--""\"".o/         .-.-._
                             __'   .""\"; {        _J ,__  `.
                            ; o\\.-.`._.'J;       ; /  `- /  ;
                            `--i`". `" .';       `._ __.'   |
                                \\  `""\"   \\         `;      :
                                 `."-.     ;     ____/     /
                                   `-.`     `-.-'    `"-..'
                     ___              `;__.-'"           `.
                  .-{_  `--._         /.-"                 `-.
                 /    ""T    ""---...'  _.-""   ""\"-.         `.
                ;       /                 __.-"".    `.         `,             _..
                 \\     /            __.-""       '.    \\          `.,__      .'L' }
                  `---"`-.__    __."    .-.       j     `.         :   `.  .' ,' /
                            ""\""       /   \\     :        `.       |     F' \\   ;
                                      ;     `-._,L_,-""-.   `-,    ;     `   ; /
                                       `.       7        `-._  `.__/_        \\/
                                         \\     _;            \\  _.'  `-.     /
                                          `---" `.___,,      ;""        \\  .'
                                                    _/       ;           `"
                                                 .-"     _,-'
                                                {       "";
                                                 ;-.____.'`.
                             fsc                  `.  \\ '.  :
                                                    \\  : : /
                                                     `':/ `""";
        String picture5 = """
                            _.--""-.                     \s
                        .--"        `.                   \s
                       /              \\                  \s
                      :            .   ;                 \s
                      ;            :   |                 \s
                     ::    .       ::  :                 \s
                     ::. .:'       ':.  ;                \s
                     ;::::' __.._   ::. :                \s
                    /  __.g$$$$$$""gp.._'-._             \s
                  .'.g$$$$$$$$$P   T$-.:""-/             \s
                  '-.T$$P`T$$P'     ");|.-'              \s
                      "T         .-  ,-'                 \s
                   bug l _,     /    ;\\.-"\\              \s
                       d$$bp.       /  ;   `-.           \s
                       T"--"T     .'   : \\_, :           \s
                        Y""-  _.-"  '  ;  )' ;"-._       \s
                       .:b..gdP    /  / .'  /     "-.    \s
                      / 'T$$P"   .' .'    .'         `.  \s
                   _.-`.  \\  \\    .'   .-"             \\ \s
                 .'     "-.)_ `.-"  .-"                 ;\s
                /            "-._.-"                    :""";
        Random rand = new Random();
        String[] pictures = new String[5];
        pictures[0] = picture1;
        pictures[1] = picture2;
        pictures[2] = picture3;
        pictures[3] = picture4;
        pictures[4] = picture5;

        String picture = "";
        for (int i = 0; i < pictures.length - 1; i++) {
            int random = rand.nextInt(0, 5);
            picture = pictures[random];
        }
        return picture;
    }
}
