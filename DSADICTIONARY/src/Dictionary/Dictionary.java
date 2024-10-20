package Dictionary;

import java.util.HashMap;
import java.util.Scanner;
import Dictionary.Book1;
import Dictionary.Book2;
public class Dictionary {
    private static HashMap<String, String> dictionary = new HashMap<>();


    public static void main(String[] args) {
        // Load the dictionary data from Book1 and Book2
        loadData();

        Scanner scanner = new Scanner(System.in);
        String option;

        // Display the menu
        do {
            System.out.println("\nDictionary Application");
            System.out.println("1. Look up a word");
            System.out.println("2. Add a new entry");
            System.out.println("3. Update an entry");
            System.out.println("4. Delete an entry");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                
                    break;
                case "2":
                    addEntry(scanner);
                    break;
                case "3":
                    updateEntry(scanner);
                    break;
                case "4":
                    deleteEntry(scanner);
                    break;
                case "5":
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!option.equals("5"));
    }

    // Load data from Book1 and Book2
      private static void loadData() {
         
          
          
          
        // Load Book1 (English to Ilocano) data
          System.out.println("loading Book1 data. . . ");
        Book1.loadEnglishToIlocano(dictionary);
       dictionary.put("eng:abandon", "baybay-an,"); //1
dictionary.put("eng:abdomen", "tian");  //2
dictionary.put("eng:abduct", "itaray"); //3
dictionary.put("eng:abeyance", "panagur-uray");//4
dictionary.put("eng:abundance", "kinaadu");//5
dictionary.put("eng:abuse", "panagsalungasibng");//6
//letter B
dictionary.put("eng:baby", "ubing, tagibi");//7
dictionary.put("eng:back", "licud, bucot");//8
dictionary.put("eng:backward", "palicud, pasanud");//9
dictionary.put("eng:bacon", "tosino");//10
dictionary.put("eng:bad", "dakes");//11
dictionary.put("eng:badge", "medalia");//12
//letter C       
dictionary.put("eng:cab", "auto");//13
dictionary.put("eng:cabaret", "cabaret");//14
dictionary.put("eng:cabbage", "repollo");//15
dictionary.put("eng:cake", "bibingca");//16
dictionary.put("eng:call", "ayab");//17
dictionary.put("eng:calm", "natalna");//18
//letter D
dictionary.put("eng:daily", "inaldaw");//19
dictionary.put("eng:dainty", "bassit");//20
dictionary.put("eng:dairy", "paggatasan");//21
dictionary.put("eng:dam", "tambac");//22
dictionary.put("eng:damage", "pucaw");//23
dictionary.put("eng:dame", "balasang");//24
dictionary.put("eng:dance", "sumasala");//25

//Letter E
dictionary.put("eng:each", "tunggal maysa");//26
dictionary.put("eng:eager", "mailiw");//27
dictionary.put("eng:ear", "lapayag");//28
dictionary.put("eng:early", "nasapa");//29
dictionary.put("eng:earmark", "marcaan");//30
dictionary.put("eng:earnest", "napasnec");//31

//letter F
dictionary.put("eng:fabric", "lupot");//32
dictionary.put("eng:fabrication", "panagaramid");//33
dictionary.put("eng:face", "sanguen");//34
dictionary.put("eng:facility", "kinalaca");//35
dictionary.put("eng:facsimile", "copia");//36
dictionary.put("eng:faculty", "mamaestro");//37
//Letter G
dictionary.put("eng:gain", "gunggonna");//38
dictionary.put("eng:gale", "allawig");//39
dictionary.put("eng:gall", "pait");//40
dictionary.put("eng:gallant", "natacneng");//41
dictionary.put("eng:gallery", "pagbuyaan");//42
dictionary.put("eng:gallon", "galon");//43

//Letter H
dictionary.put("eng:habit", "uglai");//44
dictionary.put("eng:hall", "salas");//45
dictionary.put("eng:halt", "agsardeng");//46
dictionary.put("eng:ham", "hamon");//47
dictionary.put("eng:hammer", "martillo");//48
dictionary.put("eng:hammock", "indayon");//49
dictionary.put("eng:hand", "ima");//50

//I-M: 15 words
//Letter I
dictionary.put("eng:ice", "hielo");//51
dictionary.put("eng:ice cream", "sorbetes");//52
dictionary.put("eng:idea", "panunot");//53
//letter J
dictionary.put("eng:jab", "danogen");//54
dictionary.put("eng:jail", "pagbaludan");//55
dictionary.put("eng:jaw", "timid");//56
//letter K
dictionary.put("eng:key", "tulbec");//57
dictionary.put("eng:kick", "cugtar");//58
dictionary.put("eng:kind", "clase");//59
//letter L
dictionary.put("eng:label", "marcaan");//60
dictionary.put("eng:labor", "aramid");//61
dictionary.put("eng:lace", "laso");//62
//letter M
dictionary.put("eng:mad", "macapungtot");//63
dictionary.put("eng:mail", "correo");//64
dictionary.put("eng:majestic", "dackel");//65

//N-S: 20 words
//letter N (3 words)
dictionary.put("eng:nail", "lansa");//66
dictionary.put("eng:naked", "labus");//67
dictionary.put("eng:name", "nagan");//68
//letter O (3 words)
dictionary.put("eng:o'clock", "ti horas");//69
dictionary.put("eng:obey", "agtungpal");//70
dictionary.put("eng:object", "sumupiat");//71
//letter P (3 words)
dictionary.put("eng:pace", "addang");//72
dictionary.put("eng:padlock", "candado");//73
dictionary.put("eng:pain", "utot");//74
//letter Q (3 words)
dictionary.put("eng:quail", "pugo");//75
dictionary.put("eng:quality", "clase");//76
dictionary.put("eng:quarrel", "apa");//77
//letter R (4 words)
dictionary.put("eng:rain", "tudo");//78
dictionary.put("eng:rainbow", "bullalayaw");//79
dictionary.put("eng:rainy", "matutudo");//80
dictionary.put("eng:rare", "manmano");//81
//letter S (4 words)
dictionary.put("eng:sad", "naliday");//82
dictionary.put("eng:safe", "natalged");//83
dictionary.put("eng:salt", "asin");//84
dictionary.put("eng:salty", "naapgad");//85
//T-Z: 10 words
//letter T
dictionary.put("eng:table", "dalang");//86
dictionary.put("eng:tablet", "tail");//87
//letter U
dictionary.put("eng:ugly", "naalas");//88
dictionary.put("eng:uncle", "uliteg");//89
dictionary.put("eng:under", "siroc");//90
//letter V
dictionary.put("eng:vacant", "awang");//91
dictionary.put("eng:valid", "mabalin");//92
dictionary.put("eng:value", "pateg");//93
//letter W
dictionary.put("eng:waist", "sibet");//94
dictionary.put("eng:wait", "aguray");//95
dictionary.put("eng:wall", "diding");//96
//letter Y
dictionary.put("eng:yam", "ubi");//97
dictionary.put("eng:year", "tawen");//98
dictionary.put("eng:yellow", "duyaw");//99
//letter Z
dictionary.put("eng:zero", "awan");//100
dictionary.put("eng:zone", "paset");//101
//letter A in Tagalog to Ilocano
dictionary.put("tag:pinabayaan","baybay-an,"); //1
dictionary.put("tag:tiyan","tian");  //2
dictionary.put("tag:dukutin","itaray"); //3
dictionary.put("tag:pagpapaliban","panagur-uray");//4
dictionary.put("tag:kasaganaan","kinaadu");//5
dictionary.put("tag:pang-abuso","panagsalungasibng");//6
//letter B in Tagalog to Ilocano
dictionary.put("tag:bata","ubing, tagibi");//7
dictionary.put("tag:likod","licud, bucot");//8
dictionary.put("tag:paurong","palicud, pasanud");//9
dictionary.put("tag:bekon","tosino");//10
dictionary.put("tag:masama","dakes");//11
dictionary.put("tag:tsapa","medalia");//12
//letter C in Tagalog to Ilocano 
dictionary.put("tag:taksi","auto");//13
dictionary.put("tag:kabaret","cabaret");//14
dictionary.put("tag:repolyo","repollo");//15
dictionary.put("tag:keik","bibingca");//16
dictionary.put("tag:tawag","ayab");//17
dictionary.put("tag:kalmado","natalna");//18
//letter D in Tagalog to Ilocano
dictionary.put("tag:araw-araw","inaldaw");//19
dictionary.put("tag:maselan","bassit");//20
dictionary.put("tag:gatasan","paggatasan");//21
dictionary.put("tag:prinsa","tambac");//22
dictionary.put("tag:pinsala","pucaw");//23
dictionary.put("tag:dalaga","balasang");//24
dictionary.put("tag:sayaw","sumasala");//25
//Letter E in Tagalog to Ilocano
dictionary.put("tag:bawat isa","tunggal maysa");//26
dictionary.put("tag:sabik","mailiw");//27
dictionary.put("tag:tainga","lapayag");//28
dictionary.put("tag:maaga","nasapa");//29
dictionary.put("tag:markahan","marcaan");//30
dictionary.put("tag:taimtim","napasnec");//31
//letter F in Tagalog to Ilocano
dictionary.put("tag:tela","lupot");//32
dictionary.put("tag:katha","panagaramid");//33
dictionary.put("tag:muka","sanguen");//34
dictionary.put("tag:pasilidad","kinalaca");//35
dictionary.put("tag:paksimile","copia");//36
dictionary.put("tag:pakultad","mamaestro");//37
//Letter G in Tagalog to Ilocano
dictionary.put("tag:makakuha","gunggonna");//38
dictionary.put("tag:malakas na hangin","allawig");//39
dictionary.put("tag:apdo","pait");//40
dictionary.put("tag:galante","natacneng");//41
dictionary.put("tag:galerya","pagbuyaan");//42
dictionary.put("tag:galon","galon");//43
//Letter H in Tagalog to Ilocano
dictionary.put("tag:ugali","uglai");//44
dictionary.put("tag:pasilyo","salas");//45
dictionary.put("tag:huminto","agsardeng");//46
dictionary.put("tag:hamon","hamon");//47
dictionary.put("tag:martilyo","martillo");//48
dictionary.put("tag:duyan","indayon");//49
dictionary.put("tag:kamay","ima");//50
//Letter I-M in Tagalog to Ilocano
dictionary.put("tag:yelo","hielo");//51
dictionary.put("tag:surbetes","sorbetes");//52
dictionary.put("tag:ideya","panunot");//53
//letter J in Tagalog to Ilocano
dictionary.put("tag:papok","danogen");//54
dictionary.put("tag:kulungan","pagbaludan");//55
dictionary.put("tag:panga","timid");//56
//letter K in Tagalog to Ilocano
dictionary.put("tag:susi","tulbec");//57
dictionary.put("tag:sipa","cugtar");//58
dictionary.put("tag:mabait","clase");//59
//letter L in Tagalog to Ilocano
dictionary.put("tag:karatula","marcaan");//60
dictionary.put("tag:paggawa","aramid");//61
dictionary.put("tag:puntas","laso");//62
//letter M in Tagalog to Ilocano
dictionary.put("tag:galit","macapungtot");//63
dictionary.put("tag:mail","correo");//64
dictionary.put("tag:marilag","dackel");//65
//N-S in Tagalog to Ilocano
dictionary.put("tag:kuko","lansa");//66
dictionary.put("tag:hubad","labus");//67
dictionary.put("tag:pangalan","nagan");//68
dictionary.put("tag:oras","ti horas");//69
dictionary.put("tag:sumunod","agtungpal");//70
dictionary.put("tag:bagay","sumupiat");//71
dictionary.put("tag:bilis","addang");//72
dictionary.put("tag:kadena","candado");//73
dictionary.put("tag:sakit","utot");//74
dictionary.put("tag:pugo","pugo");//75
dictionary.put("tag:kalidad","clase");//76
dictionary.put("tag:awayan","apa");//77
dictionary.put("tag:ulan","tudo");//78
dictionary.put("tag:rainbow","bullalayaw");//79
dictionary.put("tag:bihira","manmano");//80
dictionary.put("tag:malungkot","naliday");//81
dictionary.put("tag:ligtas","natalged");//82
dictionary.put("tag:asin","asin");//83
dictionary.put("tag:maalat","naapgad");//84
//T-Z in Tagalog to Ilocano
dictionary.put("tag:lamesa","dalang");//85
dictionary.put("tag:tablet","tail");//86
dictionary.put("tag:ugly","naalas");//87
dictionary.put("tag:tiyo","uliteg");//88
dictionary.put("tag:sa ilalim","siroc");//89
dictionary.put("tag:bakante","awang");//90
dictionary.put("tag:wasto","mabalin");//91
dictionary.put("tag:halaga","pateg");//92
dictionary.put("tag:baiwang","sibet");//93
dictionary.put("tag:maghintay","aguray");//94
dictionary.put("tag:pader","diding");//95
dictionary.put("tag:nami","ubi");//96
dictionary.put("tag:taon","tawen");//97
dictionary.put("tag:dilaw","duyaw");//98
dictionary.put("tag:sero","awan");//99
dictionary.put("tag:sona","paset");//100



        
        // Load Book2 (Tagalog to Ilocano) data
        System.out.println("loading Book2 data. . . ");
        Book2.loadTagalogToIlocano(dictionary);
        
        
        System.out.println("Data loaded. "+ dictionary);
    }

    // Look up a word in the dictionary
   public static String lookupWord(String word, String language) {
    String key = language.trim().toLowerCase() + ":" + word.trim().toLowerCase();  // Form the key
    String keyPrefix = language.trim().toLowerCase() + ":";
    String foundWords = "";
    
    if (dictionary.containsKey(key)) {
        return "Translation: " + dictionary.get(key);  // Corrected: removed extra closing parenthesis
    } else {
        return "Word not found in the dictionary.";  // Corrected: removed extra closing parenthesis
    }
}

    // Add a new entry to the dictionary
    private static void addEntry(Scanner scanner) {
        System.out.print("Enter the language (Eng/Tag): ");
        String language = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the word to add: ");
        String word = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the translation: ");
        String translation = scanner.nextLine().trim(); // Trim input

        String key = language + ":" + word;
        if (!dictionary.containsKey(key)) {
            dictionary.put(key, translation);
            System.out.println("Entry added successfully.");
        } else {
            System.out.println("Word already exists in the dictionary.");
        }
    }

    // Update an existing entry in the dictionary
    private static void updateEntry(Scanner scanner) {
        System.out.print("Enter the language (Eng/Tag): ");
        String language = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the word to update: ");
        String word = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        String key = language + ":" + word;

        if (dictionary.containsKey(key)) {
            System.out.print("Enter the new translation: ");
            String newTranslation = scanner.nextLine().trim(); // Trim input
            dictionary.put(key, newTranslation);
            System.out.println("Entry updated successfully.");
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    // Delete an entry from the dictionary
    private static void deleteEntry(Scanner scanner) {
        System.out.print("Enter the language (Eng/Tag): ");
        String language = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the word to delete: ");
        String word = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase

        String key = language + ":" + word;
        if (dictionary.containsKey(key)) {
            dictionary.remove(key);
            System.out.println("Entry deleted successfully.");
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    public void searchWord(String word) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
