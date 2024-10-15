//      Eng  to ILocano 
package Dictionary;
import java.util.HashMap;
public class Book1 {
    public static void loadEnglishToIlocano(HashMap<String, String> dictionary) {
        HashMap<String, String> EngToIlo = new HashMap<>();
        
        //A - D:25 words
        //E-H: 25 word
        //I-M: 15words
        //N-S 20words
        //T-Z: 10words
        
        //letter A
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
      
    }
     
}
