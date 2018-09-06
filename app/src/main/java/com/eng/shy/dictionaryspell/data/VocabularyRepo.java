package com.eng.shy.dictionaryspell.data;

import com.eng.shy.dictionaryspell.pojo.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VocabularyRepo {
    private static VocabularyRepo mRepo = null;

    private VocabularyRepo() {
        mAllQuestions.put("日常", getNormalRepo());
        mAllQuestions.put("日常进阶1", getProNormalRepo());
        mAllQuestions.put("日常进阶2", getProNormalRepo2());
        mAllQuestions.put("阅读考点词", getIELTSReadingRepo());
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
        questions.add(new Question("十二月", "December"));
        questions.add(new Question("十二月", "December"));
        questions.add(new Question("十二月", "December"));



        return questions;
    }


}
