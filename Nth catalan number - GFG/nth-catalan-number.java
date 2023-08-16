//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.findCatalan(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution 
{
    public static int findCatalan(int n) 
    {
        int ans[]={1,1,2,5,14,42,132,429,1430,4862,16796,58786,208012,742900,2674440,9694845,35357670,129644790,477638700,767263183,564120378,466266852,482563003,59611249,904138301,946367425,352943583,550429273,949904131,209635674,475387402,937414464,488309750,925890214,459122512,93302951,141865378,966114350,869670557,998231628,602941373,468488140,436489089,4616923,884518775,205311759,837590216,245662066,217873312,765348450,265470434,185096680,323205961,812467623,961237645,63389378,931095477,938406495,709042248,165264749,202180493,143994823,895598835,467182928,887145589,467932736,337289196,848807734,364899808,628322100,685542858,185042843,889345934,458247558,316330417,319295576,44509913,251538890,88317157,171644840,747939002,619955577,784403821,724443566,881931175,861543437,697101768,740877392,452888603,48028493,826309900,773088937,590866122,155536848,391271379,853131050,988619170,608234667,577894130,676902861,558488487,554042849,795547531,501677748,492329396,960317800,507047749,611132778,7221034,592126629,687851011,410983438,38040815,676476905,974960987,832173531,901403157,68253121,849403087,405142173,567421139,700794981,110458199,678423530,601129776,947322438,673668198,631844581,707292517,765756553,493602230,951972448,343891011,733300263,300609911,703883321,711713562,294171032,869022067,767415875,100837272,779370051,301562560,527018462,162128243,436370714,605222819,112571416,251121713,354441979,516266904,834162335,49035108,986437771,668856696,572778435,402982067,102954255,728686673,349920924,361798437,322682687,217503157,386445436,549910994,264105011,256512074,516887147,262215304,110194787,840421439,320740801,254498198,526458368,339212030,49829519,485764535,297470560,749743559,207316098,899740102,503364559,619905290,568102496,81012050,579499426,475874715,707460297,759763069,709796584,52491136,208324196,490032817,460439521,73744548,700883974,904016574,861399108,816609506,981939723,868596491,82249411,700950866,136128420,686870898,86700926,590667447,374477444,592422379,267048862,515577941,491116151,528095125,125611464,19870649,606708415,175035255,612754728,420532467,334297155,785126250,416582650,430906843,631728074,696732868,113566864,808093885,553215156,338103882,760986727,193012168,767056978,722295098,280916397,248408142,275452695,904963875,437377397,922629815,292453491,121039181,704296250,157819642,135594475,90077624,431284213,645834394,422551245,704119401,31578719,217193473,696935951,237618823,102342558,677550409,795884035,962620544,83909579,704350838,585764471,352580526,631255369,868034650,406955973,312949408,778573206,355223744,562195931,574533989,107590741,586652469,988080768,403134459,596410797,467176030,771591590,643660388,668663257,703283912,855208122,288692791,786926634,685792880,925866024,199761629,529121445,419012846,375655274,252607483,225893220,610255492,99715332,154498555,451575881,27627392,947787397,721497296,495623450,701645160,392547720,718512182,18714029,64584551,750484565,937994287,8094881,68051937,368284659,262103974,275600975,418630243,224162688,723024629,808219050,646052962,293463991,953790398,61316464,313078086,833942127,918311629,538122675,616178813,360711926,845419172,200472632,880780939,988719209,751435126,864805305,869526846,329862901,25219831,244138849,903526043,972969760,530342463,922606368,647547462,861115469,927843991,98606746,760049026,38567321,857946379,838873133,67212282,405621331,930698133,889694830,834169133,964503178,54083453,130671380,957096711,390907662,237733031,907841626,850176931,269871420,19598613,752102767,202591168,949882401,326380828,464107227,64100167,141225121,595124466,797874213,205547383,835003284,39718154,430962701,604955393,309104184,504706850,169546326,738825732,985742508,84926816,380258152,851890178,112999905,696991831,580242047,257708607,774271922,804939519,391989756,697493702,54809069,233666672,225524551,982216819,444288209,417793307,820653725,856740391,109110435,497153305,205073606,454958338,813076538,632853148,842257115,184621699,574007064,810834988,655864300,102933616,89847079,36049131,187152334,606144482,310066214,811343037,783965293,446830624,952367767,952667707,522244250,776604732,284108464,925364088,589831484,819421970,182088485,75457593,310079801,964540829,441989114,440815720,439196294,571416943,364960186,100138764,686854527,323451970,153033527,950188076,154369635,773401300,948018681,808505912,79649107,431621273,421597298,509263162,576929129,876537848,406020337,638571138,418091967,910810606,394415946,603120023,788858421,772572773,197605340,419085930,73498437,647252950,89262822,562351124,589803397,263841367,962239296,651145998,455845943,671079994,6297754,631876461,76469416,469122262,929399265,328547989,883289677,899965082,663610744,195021619,964380814,174735891,14959230,441095159,289799204,418460065,853121483,506312642,10887542,320402868,960630947,295335557,934840175,849241405,713305423,37769293,90381156,584886776,948528453,591137401,142344759,130305338,495860574,139927108,692436570,288178966,86320042,82965981,542652561,923534080,683313634,187250850,170942102,557505004,688653668,106390433,644406632,84627590,452918504,664423507,948907539,518969626,627188002,341584130,928980044,902686987,566399211,193010071,954760926,655713050,442524594,115961127,46811234,741860141,291225693,273380691,97908846,455480555,761305762,461918345,731858778,830950470,601401672,960453632,84007319,574595925,719099792,486026476,680621970,575330457,588546485,832429548,468717130,896828328,253894278,486809845,92542487,156296503,434225691,689477883,99304988,513390770,260867421,408840999,404881574,181379391,846841022,859980861,883502575,629805349,565062585,882605696,691928628,323972631,136265801,389400127,916880087,715013798,687141241,517716674,292333522,444198575,330449784,210717592,796344249,862075335,919096472,458194730,556932863,668777808,100765493,160895709,5593986,279462393,286177126,111681591,850288090,821683680,678517865,28429000,644994120,319827269,716529331,533391397,771848832,471858089,609749537,211315871,757939065,662611179,967477928,742986947,906055393,751967353,847947637,372199464,766737662,43363509,627873102,201078159,853819921,782658607,440416538,723838146,409181594,522762908,958668539,68772681,160150031,376002816,702973257,9021224,594359147,822214286,639590953,696766396,636312280,191856500,578127344,795397409,697520484,488083284,680705022,144394907,309984627,909397690,314355573,430170925,639789807,272156541,211888521,968118662,276436837,425352502,106056163,742890808,244424391,55897032,95807245,628955391,564501713,913531714,133823834,582208204,692957055,383285861,155449250,660761581,917726059,395931998,455192877,5420593,502346287,36030945,377531791,41493194,50561331,163506932,911408551,346855251,586715527,854153030,759996724,539899316,70326993,306894636,166762595,664146787,963855425,93072712,336801778,907061639,925880010,263872131,303213759,626313737,213338195,877272624,347285280,622973195,264345985,97802033,904579141,274447782,628036611,881639757,425867144,695633304,666795455,821892394,780643499,310955658,131965854,354728037,295827827,327279270,275741480,383001452,162147453,898280681,890366910,334161668,427800022,53866559,16673949,149089134,611611296,169806392,617555926,433691083,641045545,127829812,131527721,529118821,571400935,707003450,220639770,503230473,406138931,677947305,668571303,792708580,648312459,812189589,580027590,303403297,812783747,523662736,74461628,771286236,770480410,55862014,395417325,922897767,231885506,162163798,64258113,801979032,170005746,724674713,648898248,74107536,390088986,404355238,904070906,877790221,90240624,752976226,808634944,278830534,771186145,910582706,968605358,143051558,638110473,547514384,599716797,441744837,848196689,835694318,758360162,115752044,411101910,634896026,794279542,474747530,347151930,526652186,378558209,441829100,66999501,821085023,477127843,746419833,7691222,926566466,225614964,391378889,515080207,4028078,335284174,495543035,344145688,745446258,683431818,278831851,645435085,746298287,987072406,620395107,420345967,165366544,230271825,631048487,468083283,84317820,299977995,362549498,915837870,466646187,483616518,615022929,341535709,814568027,150660212,733349481,471562041,43269415,510114269,899589817,430814127,109108976,838528648,993598202,62955473,731657340,840245164,831729779,728121028,28573597,736418571,961785170,536985786,573716015,42568186,677645346,804843314,82943246,352363973,720720066,920058278,12565619,619260848,921820498,40633692,64233948,997745350,674349861,667113268,789239726,761674156,933637461,748899563,179998929,908125055,650437050,892182955,276035482,557410645,774064,874650569,788123559,806122662,357248644,810109307,393389710,507089199,844008056,333913966,451429429,877476693,510739299,648087915,469313761,817643431,374400242,103179335,73438287,7864798,459015661,234320375,942426044,233177802,462991577,199312335,130364303,371365690,541938622,137474883,83945201,419479617,299715936,940237309,773500128,598811752,63832581,186626584,253525299,542099927,195564788,438867276,500668215,811202382,196867196,567838648,526090641,238178952,730268501,718485281,836687134,744774415,997008105,832207670,199108230,834019692,515146582,811565975,377728470,24605944,826514398,326487736,139864198,817658951,252554549,591932587,891154462,635676541,870912692,601495986,31266631,264994763,49809407,306971891,546573452,992552319,467616523,418139395,654107798,16510493,375086072,119829030,106053815,712856433,589355414,805605607,95114534,920572245,959115412,305467152,661168497,885872509,970992370,317759959,457665157,188066423,129588957,668379038,985167044,792306296,622619772,227376481,925575545,567237011,868534268,624535407,786015503,139239810,112796378,923964313,812530233,72040277,857406034,948786277,952817456,231435210,15519343,149027660,483983070,387544493,110899186,495345338,198932123,989698722,411118288,292598936,705244694,820746830,76856686,894965608,110961515};
        
        return ans[n];
        
    }
}
        
