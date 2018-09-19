package com.eng.shy.dictionaryspell.data;

import android.os.Build;
import android.util.Log;

import com.eng.shy.dictionaryspell.pojo.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class VocabularyRepo {

    public final static String TAG = "VOCABULARY REPO";

    private static VocabularyRepo mRepo = null;

    private VocabularyRepo() {
        mAllQuestions.put("日常", getNormalRepo());
        mAllQuestions.put("日常进阶1", getProNormalRepo());
        mAllQuestions.put("日常进阶2", getProNormalRepo2());
        mAllQuestions.put("阅读考点词", getIELTSReadingRepo());
        mAllQuestions.put("阅读考点词2", getIELTSReadingRepo2());
        mAllQuestions.put("听力易错", getListenRepo());
        mAllQuestions.put("听力易错2", getListenRepo2());
        mAllQuestions.put("听力易错3", getListenRepo3());
        echoTotalNum ();

    }

    private void echoTotalNum () {
        for (String title : mAllQuestions.keySet()) {
            Log.e("TAG",title+"="+mAllQuestions.get(title).size());
        }
    }

    public static VocabularyRepo getInstance() {
        mRepo = new VocabularyRepo();
        return mRepo;
    }

    private HashMap<String, List> mAllQuestions = new HashMap();

    public HashMap<String, List> getmAllQuestions() {
        return mAllQuestions;
    }

    private List<Question> getNormalRepo() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("一月", "January"));
        questions.add(new Question("二月", "February"));
        questions.add(new Question("三月", "March"));
        questions.add(new Question("四月", "April"));
        questions.add(new Question("五月", "May"));
        questions.add(new Question("六月", "June"));
        questions.add(new Question("七月", "July"));
        questions.add(new Question("八月", "August"));
        questions.add(new Question("九月", "September"));
        questions.add(new Question("十月", "October"));
        questions.add(new Question("十一月", "November"));
        questions.add(new Question("十二月", "December"));

        questions.add(new Question("星期一", "Monday"));
        questions.add(new Question("星期二", "Tuesday"));
        questions.add(new Question("星期三", "Wednesday"));
        questions.add(new Question("星期四", "Thursday"));
        questions.add(new Question("星期五", "Friday"));
        questions.add(new Question("星期六", "Saturday"));
        questions.add(new Question("星期日", "Sunday"));

        questions.add(new Question("举例说明", "illustrate"));
        questions.add(new Question("论证;证明，证实;显示，展示;演示，说明", "demonstrate"));
        questions.add(new Question("信心;信任;秘密", "confidence"));
        questions.add(new Question("确信的，深信的;有信心的，沉着的;大胆的，过分自信的;厚颜无耻的", "confident"));
        questions.add(new Question("n.金融;财政;资金;财源", "finance"));
        questions.add(new Question("adj经济的;经济学的;合算的;有经济效益的", "economic"));
        questions.add(new Question("n经济;节约;理财;秩序", "economy"));
        questions.add(new Question("adj方便的", "convenient"));
        questions.add(new Question("n方便，便利;", "convenience"));

        questions.add(new Question("n.恩惠;赞同;帮助;善行", "favour"));
        questions.add(new Question("n.野餐郊游;供野餐吃的食品;猪的肩肉;轻松的工作", "picnic"));
        questions.add(new Question("n.\n" +
                "有利条件;益处;优越（性）;处于支配地位\n" +
                "vt.\n" +
                "有利于;有益于;促进;使处于有利地位\n" +
                "vi.\n" +
                "得益，获利\n", "advantage"));
        questions.add(new Question("vt.\n" +
                "预付;提出;（使）前进;将…提前\n" +
                "vi.\n" +
                "（数量等）增加;向前推（至下一步）;上涨\n" +
                "n.\n" +
                "增长;借款;（价格、价值的）上涨;预付款\n" +
                "adj.\n" +
                "预先的;先行的", "advance"));
        questions.add(new Question("n.\n" +
                "策略，战略;战略学", "strategy"));
        questions.add(new Question("n.\n" +
                "奇遇;冒险经历;冒险活动", "adventure"));
        questions.add(new Question("n.\n" +
                "乘客，旅客;行人，过路人;碍手碍脚的人", "passenger"));
        questions.add(new Question("n.\n" +
                "百年，一世纪;百个;（板球）一百分;<美>百元钞票", "century"));
        questions.add(new Question("adj.\n" +
                "安全的;牢固的;有把握的;安心的\n" +
                "vt.\n" +
                "保护;（使）获得;使安全;担保\n" +
                "vi.\n" +
                "获得安全，变得安全;安全，保险;承保，担保;[航海学]停止工作", "secure"));
        questions.add(new Question("n.\n" +
                "摩擦;摩擦力;冲突，不和", "friction"));
        questions.add(new Question("n.\n" +
                "谷物;粮食;谷类植物;荞麦食品\n" +
                "adj.\n" +
                "谷物的，谷物制成的", "cereal","[ˈsɪəriəl]"));
        questions.add(new Question("adj.野蛮的;凶猛的;未开化的;残忍的", "savage"));
        questions.add(new Question(" adj.不可避免的;", "inevitable"));
        questions.add(new Question("adj.妒忌的;吃醋的;羡慕的;精心守护的", "jealous"));
        questions.add(new Question("adj.焦急的;渴望的;令人焦虑的;流露出忧虑的", "anxious"));
        questions.add(new Question("adj.\n" +
                "明显的;显著的;平淡无奇的;自明", "obvious", "[ˈɒbviəs]"));
        return questions;
    }

    private List<Question> getProNormalRepo() {

        List<Question> questions = new ArrayList<>();

        questions.add(new Question("n.\n" + "雇主，老板;雇佣者", "employer"));
        questions.add(new Question("n.\n" +
                "雇工，雇员，职工", "employee"));
        questions.add(new Question("n.\n" +
                "窗帘，门帘;帐幕之物，幕布;启幕，落幕", "curtain"));
        questions.add(new Question("n.\n" +
                "保险费;保险，保险业;预防措施", "insurance"));
        questions.add(new Question("n.\n" +
                "弹跳;弹性;活力", "bounce"));

        questions.add(new Question("n.\n" +
                "改革，创新;新观念;新发明;新设施", "innovation"));
        questions.add(new Question("vt.\n" +
                "保护;保持，保存;腌制食物;防腐处理", "preserve"));
        questions.add(new Question("vt.\n" +
                "酿造;泡，煮;策划，酿成", "brew"));
        questions.add(new Question("vt.\n" +
                "压缩;压紧;精简", "compress"));
        questions.add(new Question("adj.\n" +
                "有毒的;中毒的;因中毒引起的", "toxic"));
        questions.add(new Question("n.\n" +
                "专利;专利权;专利品;专利证", "patent"));
        questions.add(new Question("adj.\n" +
                "竞争的，比赛的;", "competitive"));

        questions.add(new Question("n.\n" +
                "照片，相片", "photograph"));
        questions.add(new Question("n.\n" +
                "表现;表演;演技;执行", "performance"));
        questions.add(new Question("n.\n" +
                "个别辅导时间;教程，辅导材料;使用说明书;辅导课", "tutorial"));
        questions.add(new Question("n.\n" +
                "点心;茶点", "refreshment"));
        questions.add(new Question("n.\n" +
                "名气，名声;好名声;信誉，声望;荣誉，名望\n", "reputation"));
        questions.add(new Question("n.\n" +
                "社区;共同体;社会团体;[生态] 群落", "community"));

        questions.add(new Question("adj.\n" +
                "专用的;高级的;排外的;单独的", "exclusive"));

        questions.add(new Question("vt.\n" +
                "包装;围绕;把…装箱", "encase"));
        questions.add(new Question("adv.\n" +
                "彻底地;根本地;完全地;激进地", "radically"));
        questions.add(new Question("adj.\n" +
                "凌乱的，散乱的;肮脏的，污秽的;复杂的，麻烦的，难以应付的", "messy"));
        questions.add(new Question("倾向;爱好;斜坡", "inclination"));

        questions.add(new Question("n.\n" +
                "博物馆", "museum"));

        questions.add(new Question("n.\n" +
                "板;董事会;甲板;膳食\n" +
                "vt.\n" +
                "上（船、车或飞机）;收费供…膳宿;使搭伙，使寄宿;强行登（船）\n" +
                "vi.\n" +
                "（火车、轮船、飞机等）接受乘客;搭伙，寄宿", "board"));
        questions.add(new Question("adj.\n" +
                "僵硬的;严格的;（规则、方法等）死板的;刚硬的，顽固的", "rigid"));
        questions.add(new Question("vt.& vi.\n" +
                "挤，榨，捏;压迫，压榨\n" +
                "vt.\n" +
                "榨取，汲取;轻轻地捏;向…勒索（或榨取）\n" +
                "vi.\n" +
                "在强压下屈服;施加压力;挤过去\n" +
                "n.\n" +
                "挤压，压榨;抱紧，拥挤;拥挤的人群;<口>压力", "squeeze"));
        questions.add(new Question("n.\n" +
                "温度;气温;体温;<口>发烧，高烧\n", "temperature"));
        questions.add(new Question("adj.苗条的;微薄的;柔弱的", "slender"));
        questions.add(new Question("vt.\n" +
                "加强;提高，增加", "enhance"));
        questions.add(new Question("n.事实;现实，现实性;真实情况，实际情形;实体，实在", "reality"));

        questions.add(new Question("n.\n" +
                "程序，手续;工序，过程，步骤;诉讼程序，（议会的）议事程序;〈罕〉进行", "procedure","[prəˈsi:dʒə(r)]"));
        questions.add(new Question("n.\n" +
                "职业，工作;占有，占领;（土地、房屋、建筑等的）使用", "occupation","[ˌɒkjuˈpeɪʃn]"));
        questions.add(new Question("vt.\n" +
                "揭露，揭发;使暴露;使遭受;使曝光", "expose","[ɪk'spəʊz] "));
        questions.add(new Question("n.\n" +
                "家具;设备;附属品", "furniture","[ˈfɜ:nɪtʃə(r)]"));
        questions.add(new Question("n.\n" +
                "休息室;游说团;门厅，大厅;投票厅\n" +
                "vi.\n" +
                "为了支持或抵制某项特定目标游说\n" +
                "vt.\n" +
                "对…进行游说;陈情（试图努力影响某人采取有利行动）","lobby"," [ˈlɒbi] "));
        questions.add(new Question("adj.\n" +
                "有效率的;（直接）生效的;能干的;（因省钱、省时或省力等而）收效大的","efficient","[ɪˈfɪʃnt]"));
        return questions;
    }

    private List<Question> getIELTSReadingRepo() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("vt.\n" +
                "与…相像，类似于", "resemble"));
        questions.add(new Question("vt.\n" +
                "承认;识别;认出", "recognize"));
        questions.add(new Question("n.\n" +
                "方法;途径;接近", "approach"));
        questions.add(new Question("n.\n" +
                "特点，特性;少许", "trait"));
        questions.add(new Question("n.\n" +
                "硬币;金属钱币;[建筑]拐角，墙角石vt.\n" +
                "制造硬币;杜撰;创造", "coin"));
        questions.add(new Question("vt.\n" +
                "位于或存在于（某物）之下;构成…的基础（或起因）;[经]构成优先于…的财政要求", "underlie"));
        questions.add(new Question("vt.\n" +
                "查明，发现;洞察;侦察，侦查;[电子学]检波\n", "detect"));
        questions.add(new Question("adj.\n" +
                "替代的;另类的;备选的;其他的", "alternative"));
        questions.add(new Question("vt.\n" +
                "抵消;补偿，赔偿;报酬", "compensate"));
        questions.add(new Question("n.\n" +
                "全部课程，课程", "curriculum"));
        questions.add(new Question("adj.\n" +
                "可行的;可用的;可实行的;可能的", "feasible"));
        questions.add(new Question("vi.\n" +
                "区分，辨别，分清;辨别是非", "distinguish"));
        questions.add(new Question("vt.\n" +
                "模仿，效仿;仿造，伪造", "imitate"));
        questions.add(new Question("n.\n" +
                "会议;全体与会者;国际公约;惯例，习俗，规矩", "convention"));
        questions.add(new Question("adj.\n" +
                "慢性的;长期的;习惯性的;痼", "chronic"));
        questions.add(new Question("n.\n" +
                "免疫力;免除，豁免", "immunity"));
        questions.add(new Question("adj.\n" +
                "势在必行的;必要的，不可避免的;命令的，专横的;[语]祈使的", "imperative"));
        questions.add(new Question("vt.&vi.\n" +
                "夸张;（使）扩大;（使）增加", "exaggerate"));
        questions.add(new Question("adj.\n" +
                "灭绝的;绝种的;消逝的;破灭的", "extinct"));
        questions.add(new Question("n.\n" +
                "保证，担保;保证人，保证书;抵押品", "guarantee"));
        questions.add(new Question("adj.\n" +
                "潜在的，有可能的;[语法学]可能语气的，表示可能性的;有能力的\n" +
                "n.\n" +
                "潜力，潜能;[物]电位，势能;潜能的事物;[语]可能语气", "potential"));
        questions.add(new Question("n.\n" +
                "量，数量;定量，大批;数目;[语音学、韵律学]音量（指元音或音节的长短）", "quantity"));
        questions.add(new Question("n.\n" +
                "专门知识或技能;专家的意见;专家评价，鉴定", "expertise"));
        questions.add(new Question("n.\n" +
                "能力，才能;全体教职员;<英>（大学的）专科，系;特权，特许", "faculty"));
        questions.add(new Question("vt.& vi.\n" +
                "（尤指向慈善机构）捐赠;献（血）;捐（血）;捐献（器官）\n" +
                "n.\n" +
                "捐赠;捐献\n", "donate"));
        questions.add(new Question("n.\n" +
                "动机;诱因;刺激;鼓励\n" +
                "adj.\n" +
                "刺激性的;鼓励性质的", "incentive"));
        questions.add(new Question("n.\n" +
                "附近地区;附近，邻近;大约的程度或者数量;〈罕〉近亲", "vicinity"));
        questions.add(new Question("n.\n" +
                "细菌(的名词复数)", "bacteria"));

        questions.add(new Question("adj.\n" +
                "天生的;特有的，固有的;内在的，直觉的", "innate"));

        questions.add(new Question("n.\n" +
                "治疗，疗法，疗效;心理治疗;治疗力", "therapy"));

        questions.add(new Question("adj.\n" +
                "机密的;秘密的;表示信任的;亲密的", "confidential"));

        questions.add(new Question("vi.\n" +
                "咨询;商议，商量;[医]会诊;充当顾问\n" +
                "vt.\n" +
                "请教;翻阅;求教于;顾及", "consult"));

        questions.add(new Question("n.\n" +
                "暂停;停止，中止;小火车站\n" +
                "vt.\n" +
                "阻止;使停止;使中断;使立定\n" +
                "vi.\n" +
                "停止，立定;犹豫\n", "halt"));
        questions.add(new Question("vt.& vi.\n" +
                "侵蚀，腐蚀\n" +
                "vi.\n" +
                "逐渐毁坏;削弱，损害", "erode"));
        questions.add(new Question("vt.\n" +
                "引起;归纳;引诱;[电]感应", "induce"));

        return questions;
    }

    private List<Question> getProNormalRepo2() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("n.\n" +
                "煤;煤块;煤堆;木炭\n" +
                "vi.\n" +
                "上煤;加煤\n" +
                "vt.\n" +
                "给…加煤;把…烧成炭\n", "coal"));
        questions.add(new Question("n.\n" +
                "柴火;木柴;柴草;荛", "firewood"));
        questions.add(new Question("n.\n" +
                "矿物;矿物质;矿石;汽水\n" +
                "adj.\n" +
                "矿物的，似矿物的", "mineral"));
        questions.add(new Question("n.\n" +
                "小屋，村舍;（农舍式的）小别墅;（郊外的）新式住宅，（大院内的）单幢住宅;乡下房子，小房子", "cottage"));
        questions.add(new Question("adj.\n" +
                "工业的，产业的;从事工业的;供工业用的;来自勤劳的\n" +
                "n.\n" +
                "工业股票;工业工人", "industrial"));
        questions.add(new Question("n.\n" +
                "素材;材料，原料;布，织物;适当人选\n" +
                "adj.\n" +
                "物质的;肉体的;重要的，决定性的;辩证的，推论的\n", "material"));
        questions.add(new Question("vt.\n" +
                "面对;使面对面，使对质;碰到，遇到;比较", "confront"));
        questions.add(new Question("n.\n" +
                "港湾;海港，港口;避难所;藏身处\n" +
                "vt.&vi.\n" +
                "隐匿;怀着;包含，聚藏;藏有", "harbour"));
        questions.add(new Question("n.\n" +
                "学费;教学，讲授", "tuition"));
        questions.add(new Question("adv.\n" +
                "可惜;不幸地，遗憾地;不巧", "unfortunately"));
        questions.add(new Question("adj.\n" +
                "侥幸的，幸运的;带来幸运的，吉利的", "fortunate"));
        questions.add(new Question("n.\n" +
                "幸运;（某人的）命运;富有;[常作复数]（人生事件中的）时运", "fortune"));

        questions.add(new Question("adv.\n" +
                "一般地，通常;广泛地，普遍地;概括地;主要地", "generally"));
        questions.add(new Question("n.\n" +
                "产生;一代人;代（约30年），时代;生殖", "generation"));
        questions.add(new Question("adj.\n" +
                "有耐性的;能容忍的\n" +
                "n.\n" +
                "病人;患者;病号", "patient"));

        questions.add(new Question("n.\n" +
                "上诉;呼吁;[体育]诉请;（迫切的）要求（帮助、同情等）恳求\n" +
                "vi.\n" +
                "（迫切）要求;有吸引力;求助（于）;提请注意\n" +
                "vt.\n" +
                "将…移交上级法院审理\n", "appeal"));
        questions.add(new Question("adj.\n" +
                "聪明的;理解力强的;有智力的;[计]智能的", "intelligent"));
        questions.add(new Question("vt.\n" +
                "感激;欠…债;应归功于;怀有情感", "owe"));
        questions.add(new Question("adj.\n" +
                "密集的，稠密的;浓密的，浓厚的;愚钝的", "dense"));
        questions.add(new Question("n.\n" +
                "[电]电池，蓄电池;[军]炮台，炮位;一组;[法]殴打", "battery","[ˈbætri]"));
        questions.add(new Question("vt.\n" +
                "解决;安排;使定居;使沉淀\n" +
                "vi.\n" +
                "定居;下沉\n" +
                "n.\n" +
                "高背长靠椅\n", "settle"," [ˈsetl]"));
        questions.add(new Question("n.\n" +
                "解释;说明;辩解;（消除误会后）和解", "explanation","[ˌekspləˈneɪʃn]"));
        return questions;
    }

    private List<Question> getListenRepo() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("n.\n" +
                "森林;丛林;（森林似的）一丛;一片", "forest"));
        questions.add(new Question("vt.& vi.\n" +
                "使结冰霜;冻坏;（在蛋糕上）撒糖霜", "frost"));
        questions.add(new Question("adj.\n" +
                "学院的，大学的，学会的，（学术，文艺）协会的;学究的，学理上的，空谈的，非实用的;〈美〉文科的，文学的;柏拉图学派的", "academic"));
        questions.add(new Question("n.\n" +
                "体育场;运动场;[医]（疾病的第…）期", "stadium"));
        questions.add(new Question("n.\n" +
                "帐篷;帐篷状物;塞子", "tent"));
        questions.add(new Question("杂志;弹药库;弹仓;胶卷盒", "magazine"));
        questions.add(new Question("n.\n" +
                "组织;机构;团体", "organization"));
        questions.add(new Question("n.\n" +
                "观众;听众;读者;接见", "audience"));
        questions.add(new Question("adv.\n" +
                "轻微地，轻轻地;细长地，苗条地;〈罕〉轻蔑地;粗", "slightly"));
        questions.add(new Question("n.\n" +
                "庆祝;庆祝会（仪式）;颂扬", "celebration"));
        questions.add(new Question("n.\n" +
                "剧场;戏剧界;戏剧效果;[军]战区", "theater"));
        questions.add(new Question("n.\n" +
                "魔法;巫术;戏法;不可思议的魔力\n" +
                "adj.\n" +
                "魔术的;幻术的;不可思议的;有奇异魔力的\n" +
                "v.\n" +
                "用魔法变出;用魔法摆脱;用魔法得到;使中邪", "magic"));

        questions.add(new Question("成年的;成年人的;成熟的;（智力、思想、行为）成熟的\n" +
                "n.\n" +
                "成年的人或动物", "adult"));
        questions.add(new Question("n.\n" +
                "分析家，化验员;〈美〉精神病医师", "analyst"));
        questions.add(new Question("n.\n" +
                "高度，海拔高度;高位，高等;[天]地平纬度;[数]顶垂线", "altitude"));
        questions.add(new Question("n.\n" +
                "态度;看法;姿势;个人风格", "attitude"));
        questions.add(new Question("n.\n" +
                "限额;折扣;津贴，补贴，零用钱;默许，默认\n" +
                "vt.\n" +
                "给（某人）零用钱或津贴;按定量供给", "allowance"));
        questions.add(new Question("n.\n" +
                "过敏性反应;反感，厌恶", "allergy"));

        questions.add(new Question("n.\n" +
                "精确（性），准确（性）", "accuracy"));
        questions.add(new Question("n.\n" +
                "分给，分配;任务，工作，（课外）作业;<美>任命;指定，委派", "assignment"));
        questions.add(new Question("n.\n" +
                "学士;单身汉;尚未交配的幼雄兽;侍从", "bachelor"));
        questions.add(new Question("n.\n" +
                "车辆;交通工具;传播媒介，媒介物;[药]赋形剂", "vehicle"));
        questions.add(new Question("n.\n" +
                "设备;容易;能力;灵巧", "facility"));
        questions.add(new Question("n.\n" +
                "住处，住宅;居住时间，居住;公馆;驻地", "residence"));
        questions.add(new Question("n.\n" +
                "住处，住宅;居住时间，居住;公馆;驻地", "residence"));
        questions.add(new Question("n.\n" +
                "疾病;弊端;不安\n" +
                "vt.\n" +
                "传染;使…有病\n", "disease"));
        questions.add(new Question("n.\n" +
                "灾难;彻底的失败;不幸;祸患", "disaster"));
        questions.add(new Question.Builder("diary","n.\n" +
                "日记，日志;日记簿"," [ˈdaɪəri] ").build());
        questions.add(new Question.Builder("desire","vt.\n" +
                "渴望;希望;要求;请求\n" +
                "n.\n" +
                "欲望;愿望;希望;请求\n" +
                "vi.\n" +
                "愿望;有希望;期望;想望"," [dɪˈzaɪə(r)]").build());
        questions.add(new Question.Builder("destination","n.\n" +
                "目的，目标;目的地，终点;[罕用语]预定，指定"," [ˌdestɪˈneɪʃn]").build());
        questions.add(new Question.Builder("drama","n.\n" +
                "戏剧，剧本;戏剧效果;戏剧文学[艺术];戏剧性事件[场面]","[ˈdrɑ:mə]").build());
        questions.add(new Question.Builder("comedy","n.\n" +
                "喜剧;喜剧性;喜剧体裁;有趣的事情","[ˈkɒmədi]").build());
        questions.add(new Question.Builder("gesture","n.\n" +
                "手势，姿势;举止，动作;〔古语〕仪态;[计算机]光笔指令\n" +
                "vt.\n" +
                "做手势\n" +
                "vi.\n" +
                "用手势表现，表达或指导"," [ˈdʒestʃə(r)]").build());
        questions.add(new Question.Builder("graduate","vi.\n" +
                "渐变;渐渐变为（与into连用）;渐渐消逝（与away连用）;取得资格（与as连用）\n" +
                "vt.\n" +
                "授予学位或毕业证书;从…接受学位;分成等级;标以刻度\n" +
                "n.\n" +
                "<美>毕业生;<英>大学毕业生;（已经取得学士学位正在攻读高级学位的）研究生;量筒\n" +
                "adj.\n" +
                "<美>毕业了的，研究生的;有（学士）学位的","[ˈgrædʒuət]").build());
        return questions;
    }

    private List<Question> getListenRepo2() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("n.\n" +
                "发动机，引擎;工具;火车头;机车\n" +
                "vt.\n" +
                "给…安装发动机", "engine"));
        questions.add(new Question("n.\n" +
                "工程师，技师;（轮船的）机师;〈美〉（火车的）司机，;（陆军的）工兵\n" +
                "vt.\n" +
                "设计，策划;安排或处理;改变…的基因（或遗传）结构", "engineer"));
        questions.add(new Question("n.\n" +
                "流行病;迅速的传播、生长或发展;风尚等的流行\n" +
                "adj.\n" +
                "流行性的;极为盛行的", "epidemic"));
        questions.add(new Question("n.\n" +
                "伦理，伦理观;道德体系;（复数）伦理学，道德学;（复数）行为准则", "ethic"));
        questions.add(new Question("n.\n" +
                "练习;运动，训练;运用;典礼\n" +
                "vi.\n" +
                "锻炼，训练，练习\n" +
                "vt.\n" +
                "锻炼（身体某部位）;使焦虑，使忧虑;实行，发挥（作用）;运用\n", "exercise"));
        questions.add(new Question("n.\n" +
                "爆发;爆炸，炸裂;扩张，激增;（感情，尤指愤怒的）突然爆发", "explosion"));
        questions.add(new Question("n.\n" +
                "散文;随笔，杂记文;尝试，企图;试验\n" +
                "vt.\n" +
                "尝试;试验", "essay"));
        questions.add(new Question("n.\n" +
                "大使馆;大使馆全体成员;大使的职务（地位）;重任，差使", "embassy"));
        questions.add(new Question("n.\n" +
                "失败，不及格;缺乏，不足;破产，倒闭;失败的事，失败者", "failure"));
        questions.add(new Question("n.\n" +
                "面粉\n" +
                "vt.\n" +
                "撒上粉", "flour"));
        questions.add(new Question("n.\n" +
                "车库;汽车修理站;飞机库\n" +
                "vt.\n" +
                "把…送入车库;把（汽车）开进车库", "garage"));

        questions.add(new Question("n.\n" +
                "汽油", "gasoline"));
        questions.add(new Question("n.\n" +
                "头痛;令人头痛的事", "headache"));
        questions.add(new Question("n.\n" +
                "影响;<医>传染，感染;传染病，染毒物", "infection"));
        questions.add(new Question("n.\n" +
                "注射;注射剂;[医]充血;（卫星等的）入轨", "injection"));
        questions.add(new Question("vt.\n" +
                "加工;制造，生产;捏造，虚构;从事制造\n" +
                "n.\n" +
                "制造;制成品，产品;工业，工厂;（文学作品等的）粗制滥造", "manufacture"));
        questions.add(new Question("n.\n" +
                "制造商，制造厂;厂主;[经]厂商", "manufacturer"));

        questions.add(new Question("n.\n" +
                "成熟;完备;（票据等的）到期;[地]壮年期", "maturity"));
        questions.add(new Question("n.\n" +
                "道德;道德观;道德准则;品德高尚的行为", "morality"));
        questions.add(new Question("自然;天性;天理;类型", "nature"));
        questions.add(new Question("adj.\n" +
                "自然的;天生的;物质的;不做作的\n" +
                "n.\n" +
                "自然的事情;（生来的）白痴;[乐]（风琴等的）白键", "natural"));
        questions.add(new Question("社会;社团;上流社会;社群\n" +
                "adj.\n" +
                "上流社会的，社交界的", "society"));
        questions.add(new Question("adj.\n" +
                "社会的，社会上的;交际的，社交的;群居的;合群的\n" +
                "n.\n" +
                "联谊会，联欢会;社交聚会", "social"));
        questions.add(new Question("n.\n" +
                "钢琴家;钢琴师;钢琴演奏者", "pianist"));
        questions.add(new Question("n.\n" +
                "提交;演出;陈述，报告;颁奖仪式", "presentation"));
        questions.add(new Question("n.\n" +
                "保护;防腐;保存，保留;维护，保持", "preservation"));
        questions.add(new Question("n.\n" +
                "对手;竞争者\n" +
                "vt.\n" +
                "与…竞争;比得上某人\n" +
                "vi.\n" +
                "竞争\n" +
                "adj.\n" +
                "竞争的", "rival"));
        questions.add(new Question("vi.\n" +
                "合作，协作;（国家间的）协调，提携;勾结，通敌", "collaborate"));
        questions.add(new Question("n.\n" +
                "电线;金属丝;电报;（木偶的）牵线，操纵绳，背后操纵的势力，秘密引线，秘密策略\n" +
                "vi.\n" +
                "拍电报\n" +
                "vt.\n" +
                "拍电报;给…装电线", "wire"));
        questions.add(new Question("n.\n" +
                "运费;货运，货物;船运货物;货运列车\n" +
                "vt.\n" +
                "运输;装货于", "freight"));
        questions.add(new Question("n.\n" +
                "捏;拧;扭;苦恼\n" +
                "vt.\n" +
                "稍稍调整（机器、系统等", "tweak", " [twi:k] "));
        questions.add(new Question("vt.\n" +
                "绞，拧;扭干，绞出;折磨，使苦恼;曲解\n" +
                "vi.\n" +
                "扭动;蠕动;感到痛苦;感到苦恼\n" +
                "n.\n" +
                "绞，扭;紧紧握手;剧痛\n" +
                "to twist and squeeze clothes, etc. in order to get the water out of them", "wring"," [rɪŋ] "));
        questions.add(new Question("vt.\n" +
                "推翻;摧毁，拆毁（建筑物等）;毁坏，破坏;驳倒（论点、理论等）", "demolish"));
        return questions;
    }

    private List<Question> getIELTSReadingRepo2() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("adj.\n" +
                "巨大的;庞大的;极恶的;凶暴的", "enormous"));
        questions.add(new Question("n.\n" +
                "模型;霉;铸模;性格\n" +
                "vt.\n" +
                "用模子做;形成;陶冶，训练（人格）;用土覆盖", "mould"));
        questions.add(new Question("vt.& vi.\n" +
                "得到，导出;源于，来自;（从…中）提取", "derive"));
        questions.add(new Question("n.\n" +
                "动力;势头;促进;声势", "impetus"));
        questions.add(new Question("vi.\n" +
                "上飞机，上船;着手，从事\n" +
                "vt.\n" +
                "使…上船或飞机;使从事，使着手;投资于", "embark"));
        questions.add(new Question("vt.\n" +
                "治理;统治;管理;支配（词或短语的形式或用法）\n" +
                "vi.\n" +
                "控制，支配;操纵", "govern"));
        questions.add(new Question("n.\n" +
                "鄙视，轻蔑\n" +
                "vt.\n" +
                "鄙视;不屑于做，不愿意做", "disdain"));
        questions.add(new Question("adj.\n" +
                "肮脏的;下流的，令人讨厌的;恶劣的，艰险的;严重的\n" +
                "n.\n" +
                "令人不愉快的事物", "nasty"));
        questions.add(new Question("vt.\n" +
                "陪伴，陪同;附加，补充;与…共存;为…伴奏\n" +
                "vi.\n" +
                "伴奏", "accompany"));
        questions.add(new Question("adj.\n" +
                "易看见的，可看见的;显然的，明明白白的;貌似的，表面的;显见", "apparent"));
        questions.add(new Question("n.\n" +
                "紧张，不安;紧张气氛;[物]张力，拉力;矛盾\n" +
                "vt.\n" +
                "紧张;使紧张", "tension"));
        questions.add(new Question("adj.\n" +
                "决定性的;关键性的，极其显要的;十字形的", "crucial"));
        questions.add(new Question("adj.\n" +
                "认知的;认识的", "cognitive"));

        questions.add(new Question("n.\n" +
                "术语;期限;学期;条款\n" +
                "vt.\n" +
                "把…称为;把…叫做", "term"));
        questions.add(new Question("vt.\n" +
                "跟踪，追踪;追溯，探索;探索;查找\n" +
                "vi.\n" +
                "沿着一小径或道路前进;可以追溯的\n" +
                "n.\n" +
                "痕迹;痕迹，踪迹;微量，极少量;[植]（脉）迹", "trace"));

        questions.add(new Question("adj.\n" +
                "可疑的;猜疑的，怀疑的;多疑的，不信任的;多心", "suspicious"));
        questions.add(new Question("adj.\n" +
                "可持续的;可以忍受的;可支撑的", "sustainable"));
        questions.add(new Question("n.\n" +
                "步幅;大步，阔步;进展;一跨（的宽度）\n" +
                "vt.& vi.\n" +
                "跨过;大踏步走\n" +
                "vi.\n" +
                "跨\n" +
                "vt.\n" +
                "跨坐在…", "stride"));

        questions.add(new Question("n.\n" +
                "修订，修改;修订本;校对;复审，上诉", "revision"));
        questions.add(new Question("adj.\n" +
                "宗教的;虔诚的;笃信宗教的;谨慎的\n" +
                "n.\n" +
                "修士，修女，出家人", "religious"));
        questions.add(new Question("n.\n" +
                "物质，材料;实质，内容;[神]灵;（织品的）质地 [ˈsʌbstəns]", "substance"));
        questions.add(new Question("n.\n" +
                "分散;散布;消散;驱散","dispersal"," [dɪˈspɜ:sl] "));
        questions.add(new Question("adv.\n" +
                "非常;十足地;下流地;大略","grossly","[ˈgrəʊsli]"));
        questions.add(new Question("vt.\n" +
                "折磨;使受痛苦;使苦恼","afflict","[əˈflɪkt]"));
        questions.add(new Question("n.\n" +
                "泵;打气筒;轻软舞鞋;轻便帆布鞋（英式英语）\n" +
                "vt.& vi.\n" +
                "用抽水机汲水;给…打气;用泵（或泵样器官等）输送;涌出\n" +
                "vt.\n" +
                "用泵抽;注入，似用泵来拉、转或倒;抽水，从。。除去水;骑自行车的人上下蹬踏板","pump","[pʌmp]"));
        questions.add(new Question("n.\n" +
                "倾向，趋势;（话或作品等的）旨趣，意向;性情;癖好","tendency"," [ˈtendənsi] "));
        questions.add(new Question("n.\n" +
                "预测;规划，设计;[心]投射;突起物","projection","[prəˈdʒekʃn] "));
        questions.add(new Question("adj.\n" +
                "有前途的;有为;有希望的;光明","promising"," [ˈprɒmɪsɪŋ]"));
        return questions;
    }

    private List<Question> getListenRepo3() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("n.\n" +
                "金属;金属元素;成色;金色\n" +
                "vt.\n" +
                "以金属覆盖", "metal"));
        questions.add(new Question("n.\n" +
                "皮革制品;皮，皮革\n" +
                "vt.\n" +
                "用皮革包盖;（口）（用皮带等）抽打;制成皮，蒙上皮\n" +
                "adj.\n" +
                "皮的，皮革的，皮革制的", "leather"));
        questions.add(new Question("n.\n" +
                "侵袭;入侵，侵略;侵害，侵犯;[医]发病", "invasion"));
        questions.add(new Question("n.\n" +
                "限制，限定;拘束，束缚;管制", "restriction"));
        questions.add(new Question("n.\n" +
                "码头;被告席;草本植物;尾巴的骨肉部份\n" +
                "vt.& vi.\n" +
                "（使）船停靠码头;剪短（尾巴等）;削减，缩减（工资等）;在…设置船坞\n" +
                "vi.\n" +
                "入船坞", "dock"));
        questions.add(new Question("n.\n" +
                "串联;级数;系列，连续;（广播或电视上题材或角色相同的）系列节目", "series"));
        questions.add(new Question("vt.& vi.\n" +
                "分开;（使）分离;区分;隔开\n" +
                "vt.\n" +
                "分离（混合物）;分居;分类;割开\n" +
                "vi.\n" +
                "分手;断裂;（夫妻）分居;断绝关系\n" +
                "adj.\n" +
                "单独的;不同的;分开的，分离的;不相关的\n" +
                "n.\n" +
                "分开的事物;[用复数]（音响设备中的）独立件\n", "separate"));
        questions.add(new Question("n.\n" +
                "贫穷;缺乏，不足;贫瘠，不毛;低劣", "poverty"));
        questions.add(new Question("adj.\n" +
                "卫生的;清洁的\n" +
                "n.\n" +
                "公共厕所", "sanitary"));
        questions.add(new Question("adj.\n" +
                "自主的;不相关连的;无党派的;不相干的人所做的（或提供的）\n" +
                "n.\n" +
                "独立自主的人;无党派人士", "independent","[ˌɪndɪˈpendənt] "));
        questions.add(new Question("vi.\n" +
                "测量土地\n" +
                "vt.\n" +
                "调查;勘测;俯瞰\n" +
                "n.\n" +
                "调查（表），调查所，测量，测量部，测量图;概观，检查，鉴定书;环顾", "survey","[ˈsɜ:veɪ]"));
        questions.add(new Question("n.\n" +
                "陶器;陶器厂[作坊];<集合词>陶器类;陶器制造（术）", "pottery","[ˈpɒtəri]"));
        questions.add(new Question("vi.\n" +
                "测量土地\n" +
                "vt.\n" +
                "调查;勘测;俯瞰\n" +
                "n.\n" +
                "调查（表），调查所，测量，测量部，测量图;概观，检查，鉴定书;环顾", "survey","[ˈsɜ:veɪ]"));
        questions.add(new Question("n.\n" +
                "偏爱;优先权;偏爱的事物;（债权人）受优先偿还的权利", "preference","[ˈprefrəns] "));
        questions.add(new Question("n.\n" +
                "[化]朊，蛋白（质）\n" +
                "adj.\n" +
                "蛋白质的", "protein","[ˈprəʊti:n]"));
        questions.add(new Question("n.\n" +
                "同事;同行;同僚", "colleague","[ˈkɒli:g]"));
        questions.add(new Question("n.\n" +
                "出版;发表;出版物;公布\n", "publication","[ˌpʌblɪˈkeɪʃn] "));
        questions.add(new Question("n.\n" +
                "质量，品质;美质，优点;才能，能力，技能，素养;品种\n" +
                "adj.\n" +
                "优质的，高质量的;上流社会的", "quality","[ˈkwɒləti]"));
        questions.add(new Question("n.\n" +
                "四分之一;一刻钟;地区;（美式足球的）一节\n" +
                "vt.\n" +
                "把…四等分;供…住宿;使（士兵）驻扎", "quarter","[ˈkwɔ:tə(r)] "));


        questions.add(new Question("n.\n" +
                "新兵;（机构中的）新成员;新学生\n" +
                "vt.\n" +
                "招聘，征募;吸收某人为新成员;动员…（提供帮助）;雇用\n" +
                "vi.\n" +
                "征募新兵;得到补充，得到补偿;恢复健康", "recruit"," [rɪˈkru:t]"));
        questions.add(new Question("n.\n" +
                "规则;管理;控制;规章\n" +
                "adj.\n" +
                "规定的，必须穿戴的，必须使用的", "regulation","[ˌregjuˈleɪʃn]"));
        questions.add(new Question("n.\n" +
                "放宽;消遣，放松;松懈，松弛;[生理]驰松", "relaxation","[ˌri:lækˈseɪʃn]"));
        questions.add(new Question("n.\n" +
                "钱包，钱袋;财力，财源;和包或钱袋相似的东西;女用小提包\n" +
                "vt.\n" +
                "使皱起，噘起", "purse","[pɜ:s]","a small bag made of leather, plastic, etc. for carrying coins and often also paper money, cards, etc., used especially by women"));
        questions.add(new Question("n.\n" +
                "隐私，秘密;隐居;私事;不受公众干扰的状态", "privacy","[ˈprɪvəsi]"));
        questions.add(new Question("n.\n" +
                "预防，预防法;阻止，制止，妨碍，阻碍物;[谚]治病不如防病", "prevention","[prɪˈvenʃn]"));
        questions.add(new Question("n.\n" +
                "香水;香料;香味，香气\n" +
                "vt.\n" +
                "使…充满香气;喷香水于…", "perfume","[ˈpɜ:fju:m]"));
        questions.add(new Question("n.\n" +
                "生而为人;人格，人品，个性;人物;名人", "personality","[ˌpɜ:səˈnæləti]"));


        questions.add(new Question("n.\n" +
                "演变;进化;发展", "evolution","[ˌi:vəˈlu:ʃn]"));
        questions.add(new Question("n.\n" +
                "革命;旋转;彻底改变;运行，公转", "revolution","[ˌrevəˈlu:ʃn]"));
        questions.add(new Question("n.\n" +
                "分辨率;解决;决心;坚决", "resolution","[ˌrezəˈlu:ʃn]"));
        return questions;
    }


}
