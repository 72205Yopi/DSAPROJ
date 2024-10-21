package Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    // Dictionary maps for English to Tagalog and Tagalog to English
    private static final Map<String, String> EngToIlo;
    private static final Map<String, String> TagToIlo;

    static {
        EngToIlo = new HashMap<>();
        TagToIlo = new HashMap<>();

        // Sample data - add more entries as needed
        EngToIlo.put("abandon","baybay-an,"); //1
        EngToIlo.put("abdomen","tian");  //2
        EngToIlo.put("abduct","itaray"); //3
        EngToIlo.put("abeyance","panagur-uray");//4
        EngToIlo.put("abundance","kinaadu");//5
        EngToIlo.put("abuse","panagsalungasibng");//6
        //letterB
        EngToIlo.put("baby","ubing, tagibi");//7
        EngToIlo.put("back","licud, bucot");//8
        EngToIlo.put("backward","palicud, pasanud");//9
        EngToIlo.put("bacon","tosino");//10
        EngToIlo.put("bad","dakes");//11
        EngToIlo.put("badge","medalia");//12
        //letterC       
        EngToIlo.put("cab","auto");//13
        EngToIlo.put("cabaret","cabaret");//14
        EngToIlo.put("cabbage","repollo");//15
        EngToIlo.put("cake","bibingca");//16
        EngToIlo.put("call","ayab");//17
        EngToIlo.put("calm","natalna");//18
        //letterD
        EngToIlo.put("daily","inaldaw");//19
        EngToIlo.put("dainty","bassit");//20
        EngToIlo.put("dairy"," paggatasan");//21
        EngToIlo.put("dam","tambac");//22
        EngToIlo.put("damage","pucaw");//23
        EngToIlo.put("dame","balasang");//24
        EngToIlo.put("dance","sumasala");//25
        
        //Letter E
        
        EngToIlo.put("each","tunggal maysa");//26
        EngToIlo.put("eager","mailiw");//27
        EngToIlo.put("ear","lapayag");//28
        EngToIlo.put("early","nasapa");//29
        EngToIlo.put("earmark","marcaan");//30
        EngToIlo.put("earnest","napasnec");//31
        
        //letterF
        EngToIlo.put("fabric","lupot");//32
        EngToIlo.put("fabrication","panagaramid");//33
        EngToIlo.put("face"," sanguen");//34
        EngToIlo.put("facility","kinalaca");//35
        EngToIlo.put("facsimile","copia");//36
        EngToIlo.put("faculty","mamaestro");//37
        //LetterG
        
        EngToIlo.put("gain","gunggonna");//38
        EngToIlo.put("gale","allawig");//39
        EngToIlo.put("gall","pait");//40
        EngToIlo.put("gallant","natacneng");//41
        EngToIlo.put("gallery","pagbuyaan");//42
        EngToIlo.put("gallon","galon");//43
        
        //LetterH
        EngToIlo.put("habit","uglai");//44
        EngToIlo.put("hall","salas");//45
        EngToIlo.put("halt","agsardeng");//46
        EngToIlo.put("ham","hamon");//47
        EngToIlo.put("hammer","martillo");//48
        EngToIlo.put("hammock","indayon");//49
        EngToIlo.put("hand","ima");//50
        
         //I-M: 15words
         
         
      //Letter I
      EngToIlo.put("ice","hielo");//51
      EngToIlo.put("ice crem","sorbetes");//52
      EngToIlo.put("idea","panunot");//53
      //letter J
      EngToIlo.put("jab","danogen");//54
      EngToIlo.put("jail","pagbaludan");//55
      EngToIlo.put("jaw","timid");//56
      //letterK
      EngToIlo.put("key","tulbec");//57
      EngToIlo.put("kick","cugtar");//58
      EngToIlo.put("kind","clase");//59
      //letter L
      EngToIlo.put("label","marcaan");//60
      EngToIlo.put("labor"," aramid");//61
      EngToIlo.put("lace","laso");//62
      //letter M
      EngToIlo.put("mad","macapungtot");//63
      EngToIlo.put("mail","correo");//64
      EngToIlo.put("majestic","dackel");//65
      
      
      
      //N-S 20words
      //letter n 3 words
      EngToIlo.put("nail","lansa");//66
      EngToIlo.put("naked","labus");//67
      EngToIlo.put("name","nagan");//68
      //letter o 3  words
      EngToIlo.put("o'clock","ti horas");//67
      EngToIlo.put("obey","agtungpal");//68
      EngToIlo.put("object","sumupiat");//69
      //letter p 3 words
      EngToIlo.put("pace","addang");//70
      EngToIlo.put("padlock","candado");//71
      EngToIlo.put("pain","utot");//72
       //letter q 3  words
       EngToIlo.put("quail","pugo");//73
       EngToIlo.put("quality","clase");//74
       EngToIlo.put("quarrel","apa");//75
       //letter r 4 words
       EngToIlo.put("rain","tudo");//76
       EngToIlo.put("rainbow","bullalayaw");//77
       EngToIlo.put("rainy","matutudo");//78
       EngToIlo.put("rare","manmano");//79
      //letter s 4 words
      EngToIlo.put("sad","naliday");//80
      EngToIlo.put("safe","natalged");//81
      EngToIlo.put("salt","asin");//82
      EngToIlo.put("salty","naapgad");//83
      //T-Z: 10words
      //letter t 
      EngToIlo.put("table","dalang");//84
      EngToIlo.put("tablet","tail");//85
      EngToIlo.put("tablet","tail");//86
      //letter u 
      EngToIlo.put("ugly","naalas");//87
      EngToIlo.put("uncle","uliteg");//88
      EngToIlo.put("under","siroc");//89
      //letter v 
      EngToIlo.put("vacant","awang");//90
      EngToIlo.put("valid","mabalin");//91
      EngToIlo.put("value","pateg");//92
      //letter w 
      EngToIlo.put("waist","sibet");//93
      EngToIlo.put("wait","aguray");//94
      EngToIlo.put("wall","diding");//95
      //letter y 
      EngToIlo.put("yam","ubi");//96
      EngToIlo.put("year","tawen");//97
      EngToIlo.put("yellow","duyaw");//98
      //letter z 
      EngToIlo.put("zero","awan");//99
      EngToIlo.put("zone","paset");//100
       //letter A in Tagalog to Ilocano
        TagToIlo.put("pinabayaan","baybay-an,"); //1
        TagToIlo.put("tiyan","tian");  //2
        TagToIlo.put("dukutin","itaray"); //3
        TagToIlo.put("pagpapaliban","panagur-uray");//4
        TagToIlo.put("kasaganaan","kinaadu");//5
        TagToIlo.put("pang-abuso","panagsalungasibng");//6
        //letter B in Tagalog to Ilocano
        TagToIlo.put("bata","ubing, tagibi");//7
        TagToIlo.put("likod","licud, bucot");//8
        TagToIlo.put("paurong","palicud, pasanud");//9
        TagToIlo.put("bekon","tosino");//10
        TagToIlo .put("masama","dakes");//11
        TagToIlo.put("tsapa","medalia");//12
        //letter C in Tagalog to Ilocano 
        TagToIlo.put("taksi","auto");//13
        TagToIlo.put("kabaret","cabaret");//14
        TagToIlo.put("repolyo","repollo");//15
        TagToIlo.put("keik","bibingca");//16
        TagToIlo.put("tawag","ayab");//17
        TagToIlo.put("kalmado","natalna");//18
        //letter D in Tagalog to Ilocano
        TagToIlo.put("araw-araw","inaldaw");//19
        TagToIlo.put("maselan","bassit");//20
        TagToIlo.put("gatasan"," paggatasan");//21
        TagToIlo.put("prinsa","tambac");//22
        TagToIlo.put("pinsala","pucaw");//23
        TagToIlo.put("dalaga","balasang");//24
        TagToIlo.put("sayaw","sumasala");//25        
        //Letter E in Tagalog to Ilocano
        TagToIlo.put("bawat isa","tunggal maysa");//26
        TagToIlo.put("sabik","mailiw");//27
        TagToIlo.put("tainga","lapayag");//28
        TagToIlo.put("maaga","nasapa");//29
        TagToIlo.put("markahan","marcaan");//30
        TagToIlo.put("taimtim","napasnec");//31        
        //letter F in Tagalog to Ilocano
        TagToIlo.put("tela","lupot");//32
        TagToIlo.put("katha","panagaramid");//33
        TagToIlo.put("muka"," sanguen");//34
        TagToIlo.put("pasilidad","kinalaca");//35
        TagToIlo.put("paksimile","copia");//36
        TagToIlo.put("pakultad","mamaestro");//37
        //Letter G in Tagalog to Ilocano    
        TagToIlo.put("makakuha","gunggonna");//38
        TagToIlo.put("malakas na hangin","allawig");//39
        TagToIlo.put("apdo","pait");//40
        TagToIlo.put("galante","natacneng");//41
        TagToIlo.put("galerya","pagbuyaan");//42
        TagToIlo.put("galon","galon");//43        
        //Letter H in Tagalog to Ilocano
        TagToIlo.put("ugali","uglai");//44
        TagToIlo.put("pasilyo","salas");//45
        TagToIlo.put("huminto","agsardeng");//46
        TagToIlo.put("hamon","hamon");//47
        TagToIlo.put("martilyo","martillo");//48
        TagToIlo.put("duyan","indayon");//49
        TagToIlo.put("kamay","ima");//50
        
         //15words
         
         
      //Letter I-M in Tagalog to Ilocano
      TagToIlo.put("yelo","hielo");//51
      TagToIlo.put("surbetes","sorbetes");//52
      TagToIlo.put("ideya","panunot");//53
      //letter J in Tagalog to Ilocano
      TagToIlo.put("papok","danogen");//54
      TagToIlo.put("kulungan","pagbaludan");//55
      TagToIlo.put("panga","timid");//56
      //letter K in Tagalog to Ilocano
      TagToIlo.put("susi","tulbec");//57
      TagToIlo.put("sipa","cugtar");//58
      TagToIlo.put("mabait","clase");//59
      //letter L in Tagalog to Ilocano
      TagToIlo.put("karatula","marcaan");//60
      TagToIlo.put("paggawa"," aramid");//61
      TagToIlo.put("puntas","laso");//62
      //letter M in Tagalog to Ilocano
      TagToIlo.put("galit","macapungtot");//63
      TagToIlo.put("mail","correo");//64
      TagToIlo.put("marilag","dackel");//65
      
      
      
      //N-S 20words in Tagalog to Ilocano
      //letter n 3 words in Tagalog to Ilocano
      TagToIlo.put("kuko","lansa");//66
      TagToIlo.put("hubad","labus");//67
      TagToIlo.put("pangalan","nagan");//68
      //letter o 3  words in Tagalog to Ilocano
      TagToIlo.put("oras","ti horas");//67
      TagToIlo.put("sumunod","agtungpal");//68
      TagToIlo.put("bagay","sumupiat");//69
      //letter p 3 words in Tagalog to Ilocano
      TagToIlo.put("bilis","addang");//70
      TagToIlo.put("kadena","candado");//71
      TagToIlo.put("sakit","utot");//72
       //letter q 3 words in Tagalog to Ilocano
       TagToIlo.put("pugo","pugo");//73
       TagToIlo.put("kalidad","clase");//74
       TagToIlo.put("awayan","apa");//75
       //letter r 4 words in Tagalog to Ilocano
       TagToIlo.put("ulan","tudo");//76
       TagToIlo.put("rainbow","bullalayaw");//77
       TagToIlo.put("bahaghari","matutudo");//78
       TagToIlo.put("bihira","manmano");//79
      //letter s 4 words in Tagalog to Ilocano
      TagToIlo.put("malungko","naliday");//80
      TagToIlo.put("ligtas","natalged");//81
      TagToIlo.put("asin","asin");//82
      TagToIlo.put("maalat","naapgad");//83
      //T-Z: 10 words in Tagalog to Ilocano
      //letter t in Tagalog to Ilocano
      TagToIlo.put("lamesa","dalang");//84
      TagToIlo.put("tableta","tail");//85
      TagToIlo.put("tablet","tail");//86
      //letter u in Tagalog to Ilocano
      TagToIlo.put("pangit","naalas");//87
      TagToIlo.put("tiyo","uliteg");//88
      TagToIlo.put("sa ilalim","siroc");//89
      //letter v in Tagalog to Ilocano
      TagToIlo.put("bakante","awang");//90
      TagToIlo.put("wasto","mabalin");//91
      TagToIlo.put("halaga","pateg");//92
      //letter w in Tagalog to Ilocano
      TagToIlo.put("baiwang","sibet");//93
      TagToIlo.put("maghintay","aguray");//94
      TagToIlo.put("pader","diding");//95
      //letter y in Tagalog to Ilocano
      TagToIlo.put("nami","ubi");//96
      TagToIlo.put("taon","tawen");//97
      TagToIlo.put("dilaw","duyaw");//98
      //letter z in Tagalog to Ilocano
      TagToIlo.put("sero","awan");//99
      TagToIlo.put("sona","paset");//100
    }

    public static String lookupWord(String language, String word) {
        // Normalize the input to lower case
        word = word.toLowerCase();

        // Perform lookup based on the selected language
        switch (language) {
            case "English":
                return EngToIlo.getOrDefault(word, "No definition found.");
            case "Tagalog":
                return TagToIlo.getOrDefault(word, "No definition found.");
            default:
                return "Invalid language selected.";
        }
    }
}
