package com.eng.shy.dictionaryspell.data;

import android.util.Log;

import com.eng.shy.dictionaryspell.pojo.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VocabularyRepo {

    public final static String TAG = "VOCABULARY REPO";

    private static VocabularyRepo mRepo = null;

    private VocabularyRepo() {
        mAllQuestions.put("日常", getNormalRepo());
        mAllQuestions.put("日常进阶1", getProNormalRepo());
        mAllQuestions.put("日常进阶2", getProNormalRepo2());
        mAllQuestions.put("阅读考点词", getIELTSReadingRepo());
        mAllQuestions.put("阅读考点词2", getIELTSReadingRepo2());
        mAllQuestions.put("阅读考点词3", getIELTSReadingRepo3());
        mAllQuestions.put("听力易错", getListenRepo());
        mAllQuestions.put("听力易错2", getListenRepo2());
        mAllQuestions.put("听力易错3", getListenRepo3());
        mAllQuestions.put("没事往里填填词", getDreamRepo());
        mAllQuestions.put("人体,性格,动作", getPersonRepo());
        mAllQuestions.put("生物化学", getAniVet());
        mAllQuestions.put("常见常错", getOftenErrorRepo3());
        echoTotalNum();

    }

    private void echoTotalNum() {
        int sum = 0;
        for (String title : mAllQuestions.keySet()) {
            Log.e("TAG", title + "=" + mAllQuestions.get(title).size());
            sum = sum + mAllQuestions.get(title).size();
        }
        Log.e("TAG", "total=" + sum);
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
                "谷物的，谷物制成的", "cereal", "[ˈsɪəriəl]"));
        questions.add(new Question("adj.野蛮的;凶猛的;未开化的;残忍的", "savage"));
        questions.add(new Question(" adj.不可避免的;", "inevitable"));
        questions.add(new Question("adj.妒忌的;吃醋的;羡慕的;精心守护的", "jealous"));
        questions.add(new Question("adj.焦急的;渴望的;令人焦虑的;流露出忧虑的", "anxious"));
        questions.add(new Question("adj.\n" +
                "明显的;显著的;平淡无奇的;自明", "obvious", "[ˈɒbviəs]"));
        questions.add(new Question("vt.\n" +
                "认为;注视;涉及;尊敬\n" +
                "vi.\n" +
                "凝视;留意\n" +
                "n.\n" +
                "凝视;留意;尊敬;问候", "regard", "[rɪˈgɑ:d]"));
        questions.add(new Question("vt.\n" +
                "提倡;鼓吹;拥护;为…辩护\n" +
                "n.\n" +
                "提倡者;（辩护）律师;支持者", "advocate", "[ˈædvəkeɪt]"));
        questions.add(new Question("n.\n" +
                "顺序;[数]数列，序列;连续;片断插曲\n" +
                "vt.\n" +
                "使按顺序排列，安排顺序;[生化]确定…的顺序，确定…的化学结构序列", "sequence", "[ˈsi:kwəns]"));
        questions.add(new Question("n.\n" +
                "推论;结果，成果;[逻]结论;重要性", "consequence", "[ˈkɒnsɪkwəns] "));
        questions.add(new Question("vi.\n" +
                "犹豫，踌躇;不愿;支吾;停顿\n" +
                "vt.\n" +
                "对…犹豫;不情愿", "hesitate", "[ˈhezɪteɪt]"));
        questions.add(new Question("n.\n" +
                "现象，事件;奇迹;非凡的人", "phenomenon", "[fəˈnɒmɪnən]"));
        questions.add(new Question("vt.\n" +
                "复制，复写;重复，反复;折转;[生] 复制\n" +
                "adj.\n" +
                "复制的;折叠的;[植]折转的\n" +
                "n.\n" +
                "复制品;八音阶间隔的反覆音", "replicate", "[ˈreplɪkeɪt]"));
        questions.add(new Question("vt.\n" +
                "控制;管理;限制;支配\n" +
                "n.\n" +
                "支配权;操纵者;（对国家、地区、机构等的）管理权;（键盘上的）控制键", "control", "[kənˈtrəʊl]"));
        questions.add(new Question("adj.\n" +
                "外国的，外交的;外来的;不相干的;[医]异质的", "foreign", "[ˈfɒrən]"));
        questions.add(new Question("n.\n" +
                "外国人;外人，陌生人;外来物，进口货物;（非本土的）外来动植物", "foreigner", "[ˈfɒrənə(r)]"));
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
                "程序，手续;工序，过程，步骤;诉讼程序，（议会的）议事程序;〈罕〉进行", "procedure", "[prəˈsi:dʒə(r)]"));
        questions.add(new Question("n.\n" +
                "职业，工作;占有，占领;（土地、房屋、建筑等的）使用", "occupation", "[ˌɒkjuˈpeɪʃn]"));
        questions.add(new Question("vt.\n" +
                "揭露，揭发;使暴露;使遭受;使曝光", "expose", "[ɪk'spəʊz] "));
        questions.add(new Question("n.\n" +
                "家具;设备;附属品", "furniture", "[ˈfɜ:nɪtʃə(r)]"));
        questions.add(new Question("n.\n" +
                "休息室;游说团;门厅，大厅;投票厅\n" +
                "vi.\n" +
                "为了支持或抵制某项特定目标游说\n" +
                "vt.\n" +
                "对…进行游说;陈情（试图努力影响某人采取有利行动）", "lobby", " [ˈlɒbi] "));
        questions.add(new Question("adj.\n" +
                "有效率的;（直接）生效的;能干的;（因省钱、省时或省力等而）收效大的", "efficient", "[ɪˈfɪʃnt]"));
        questions.add(new Question("n.\n" +
                "发明;发明物;捏造：内心捏造的东西，特指谎言;发明才能", "invention", "[ɪnˈvenʃn]"));
        questions.add(new Question("adj.\n" +
                "时间的;世俗的;暂存的;<语>表示时间的\n" +
                "n.\n" +
                "暂存的事物，世间的事物;世俗的权力;一时的事物，俗事", "temporal", "[ˈtempərəl]"));
        questions.add(new Question("vt.\n" +
                "表明，标示，指示;象征，暗示，预示;[医]显示需要做…的治疗", "indicate", "[ˈɪndɪkeɪt]"));
        questions.add(new Question("vt.\n" +
                "宣判有罪;证明…有罪;使知罪;定…的罪\n" +
                "n.\n" +
                "罪犯", "convict", "[kənˈvɪkt]"));
        questions.add(new Question("n.\n" +
                "创造性，创造力，创作能力", "creativity", "[ˌkri:eɪ'tɪvətɪ]"));
        questions.add(new Question("vi.\n" +
                "发芽;抽芽\n" +
                "vt.\n" +
                "使发芽;使生长\n" +
                "n.\n" +
                "幼芽，新梢;[植]球芽甘蓝;幼苗状物，年轻人;美俚〉后代", "sprout", "[spraʊt]"));
        questions.add(new Question("vt.\n" +
                "刺激;激励，鼓舞;使兴奋\n" +
                "vi.\n" +
                "起兴奋作用;起促进作用;起刺激作用", "stimulate", "[ˈstɪmjuleɪt]"));
        questions.add(new Question("n.\n" +
                "审计，查账\n" +
                "vt.\n" +
                "审计，查账;旁听\n" +
                "vi.\n" +
                "审计", "audit", "[ˈɔ:dɪt]"));
        questions.add(new Question("vi.\n" +
                "出现，浮现;暴露;摆脱", "emerge", "[iˈmɜ:dʒ]"));
        questions.add(new Question("adj.\n" +
                "精密;精确的;清晰的;正规的", "precise", "[prɪˈsaɪs]"));
        questions.add(new Question("vt.\n" +
                "奉献;把…奉献（给），把…专用（于）", "devote", "[dɪˈvəʊt]"));
        questions.add(new Question("adj.\n" +
                "国内的;家庭的，家的;驯养的;热心家务的\n" +
                "n.\n" +
                "佣人;国货", "domestic", "[dəˈmestɪk]"));
        questions.add(new Question("adj.\n" +
                "异国的;外来的;异乎寻常的，奇异的;吸引人的\n" +
                "n.\n" +
                "舶来品，外来物;脱衣舞女", "exotic", "[ɪgˈzɒtɪk]"));
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
        questions.add(new Question("adj.\n" +
                "市的，市政的;地方自治的;都市的，市营的，市制的;内政的\n" +
                "n.\n" +
                "市政债券", "municipal", "[mju:ˈnɪsɪpl]"));
        questions.add(new Question("adj.\n" +
                "平的;单调的;不景气的;干脆的\n" +
                "adv.\n" +
                "（尤指贴着另一表面）平直地;断然地;水平地;直接地，完全地\n" +
                "n.\n" +
                "平面;公寓;平地\n" +
                "vt.\n" +
                "使变平;[音乐]使（音调）下降，尤指降半音\n" +
                "vi.\n" +
                "逐渐变平;[音乐]以降调唱（或奏）\n", "flat", "[flæt]"));
        questions.add(new Question("adj.\n" +
                "光学的;视觉的，视力的;眼睛的", "optical", "[ˈɒptɪkl]"));

        questions.add(new Question("n.\n" +
                "大破坏，浩劫;蹂躏，摧残;大混乱，大骚动\n" +
                "vt.\n" +
                "严重破坏;毁灭\n" +
                "vi.\n" +
                "损毁", "havoc", "[ˈhævək]"));
        questions.add(new Question("vt.\n" +
                "使逐步升级;使逐步上升;乘自动梯上升\n" +
                "vi.\n" +
                "逐步扩大;逐步上升;（战争）逐步升级;像乘自动梯上升", "escalate", "[ˈeskəleɪt]"));
        questions.add(new Question("n.\n" +
                "危险;冒险\n" +
                "vt.\n" +
                "置…于危险中;危及", "peril", "[ˈperəl]"));
        questions.add(new Question("n.\n" +
                "摧毁，根除", "eradication", " [ɪˌrædɪ'keɪʃn] "));
        questions.add(new Question("n.\n" +
                "杂草;大麻;废物;烟草\n" +
                "vt.\n" +
                "给…除杂草;除（草）;消除\n" +
                "vi.\n" +
                "除草\n", "weed", "[wi:d]"));
        questions.add(new Question("adj.\n" +
                "难以捉摸的;不易记住的;逃避的;难以找到的", "elusive", "[iˈlu:sɪv]"));
        questions.add(new Question("n.\n" +
                "怜悯，同情;恻隐之心", "compassion", "[kəmˈpæʃn]"));
        questions.add(new Question("n.\n" +
                "配给，分配;分配额（或量）;划拨的款项;拨给的场地", "allocation", "[ˌæləˈkeɪʃn]"));
        questions.add(new Question("vt.\n" +
                "使分心;使混乱", "distract", "[dɪˈstrækt]"));
        questions.add(new Question("n.\n" +
                "诱惑，引诱;诱惑物", "temptation", "[tempˈteɪʃn]"));
        questions.add(new Question("v.\n" +
                "抵抗，抗拒;忍耐;反对，抵制\n" +
                "n.\n" +
                "防染剂;防腐剂", "resist", "[rɪˈzɪst]"));
        questions.add(new Question("vt.& vi.\n" +
                "继承\n" +
                "vt.\n" +
                "经遗传获得（品质、身体特征等），继任", "inherit", "[ɪnˈherɪt]"));
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
        questions.add(new Question("adv.\n" +
                "一般地，通常;广泛地，普遍地;概括地;主要地", "generate"));
        questions.add(new Question("vt.\n" +
                "形成，造成;产生物理反应;产生（后代）;引起", "generation"));
        questions.add(new Question("n.\n" +
                "<军>手榴弹;催泪弹，灭火弹", "grenade", "[grəˈneɪd]"));
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
                "[电]电池，蓄电池;[军]炮台，炮位;一组;[法]殴打", "battery", "[ˈbætri]"));
        questions.add(new Question("vt.\n" +
                "解决;安排;使定居;使沉淀\n" +
                "vi.\n" +
                "定居;下沉\n" +
                "n.\n" +
                "高背长靠椅\n", "settle", " [ˈsetl]"));
        questions.add(new Question("n.\n" +
                "解释;说明;辩解;（消除误会后）和解", "explanation", "[ˌekspləˈneɪʃn]"));
        questions.add(new Question("adj.\n" +
                "模糊的;（思想上）不清楚的;（表达或感知）含糊的;暧昧的\n" +
                "n.\n" +
                "模糊不定状态", "vague", "[veɪg]"));
        questions.add(new Question("adj.\n" +
                "纯粹的;仅仅，只不过;小的，轻微的\n" +
                "n.\n" +
                "小湖，池塘;〈英〉边境（线）", "mere", "[mɪə(r)]"));
        questions.add(new Question("vt.& vi.\n" +
                "拥抱\n" +
                "vt.\n" +
                "接受;信奉;包括;包含\n" +
                "n.\n" +
                "拥抱，怀抱", "embrace", "[ɪmˈbreɪs]"));
        questions.add(new Question("vt.\n" +
                "刺激;使有动机，促动，激发，诱导;激发…的积极性", "motivate", "[ˈməʊtɪveɪt]"));
        questions.add(new Question("adj.\n" +
                "不一致的，不调和的;前后矛盾的，不合逻辑的;反复无常的;歧出", "inconsistent", "[ˌɪnkənˈsɪstənt]"));
        questions.add(new Question("vt.\n" +
                "压下，压低;使沮丧;使萧条;使跌价", "depress", " [dɪˈpres] "));
        questions.add(new Question("adv.\n" +
                "为此，因此", "therefore", " [ðeə'fɔ:"));
        questions.add(new Question("conj.\n" +
                "然而;鉴于;反之\n" +
                "n.\n" +
                "“鉴于…”：正式文件的介绍性陈述，开场白;条件性陈述", "whereas", " [ˌweərˈæz] "));
        questions.add(new Question("n.\n" +
                "气味，臭气;声望，名誉", "odour", "[ˈəʊdə(r)]"));
        questions.add(new Question("vt.\n" +
                "拥有;掌握，懂得;主宰;缠住，迷住", "possess", " [pəˈzes]"));
        questions.add(new Question("n.\n" +
                "过程;工序;做事方法;工艺流程\n" +
                "vt.\n" +
                "处理;加工;审阅;审核\n" +
                "vi.\n" +
                "列队行进\n" +
                "adj.\n" +
                "经过特殊加工（或处理）的", "process", "[ˈprəʊses]"));
        questions.add(new Question("n.\n" +
                "导航;指导，引导;领导", "guidance", "[ˈgaɪdns]"));
        questions.add(new Question("adj.\n" +
                "明确的;一定的;肯定;有把握", "definite", " [ˈdefɪnət]"));
        questions.add(new Question("n.\n" +
                "高潮;顶点，极点;层进法;[生物学]顶极群落\n" +
                "vt.& vi.\n" +
                "达到顶点;达到巅峰;使达到高潮;使达到性高潮", "climax", "[ˈklaɪmæks]"));
        questions.add(new Question("n.\n" +
                "秘诀;奥秘;秘密，机密\n" +
                "adj.\n" +
                "隐秘的;神秘的;秘密的，机密的\n", "secret", " [ˈsi:krət]"));
        questions.add(new Question("n.\n" +
                "奇迹，圣迹，神迹;令人惊奇的人（或事）", "miracle", "[ˈmɪrəkl]"));
        questions.add(new Question("v.\n" +
                "称赞;赞扬;向…欢呼;向…喝彩\n" +
                "n.\n" +
                "公开赞扬;称誉\n" +
                "热烈欢迎或赞同", "acclaim", "[əˈkleɪm]"));
        questions.add(new Question("n.\n" +
                "忏悔;承认，自首;供认状;信条，教义", "confession", "[kənˈfeʃn]"));
        questions.add(new Question("n.\n" +
                "（尤指宗教）信条，教义;主义，纲领;宗派", "creed", "[kri:d]"));
        questions.add(new Question("vt.\n" +
                "责备，责骂;使丢脸;申斥;损伤…的体面\n" +
                "n.\n" +
                "谴责;责备，责骂;耻辱，污辱;[宗]应答圣歌", "reproach", "[rɪˈprəʊtʃ]"));
        questions.add(new Question("n.\n" +
                "好奇心，爱打听的癖性;奇人;奇物，古玩;奇特性", "curiosity", "[ˌkjʊəriˈɒsəti]"));
        questions.add(new Question("n.\n" +
                "地区;教区;〈美〉（各州众议员）选举区;行政区，市区\n" +
                "vt.\n" +
                "把…分区", "district", "[ˈdɪstrɪkt]"));
        questions.add(new Question("n.\n" +
                "讨论，谈论;详述，论述", "discussion", "[dɪˈskʌʃn]"));
        questions.add(new Question("adj.\n" +
                "综合的;广泛的;有理解力的，悟性好的;[保险业]总体担保的\n" +
                "n.\n" +
                "[常用复数]专业综合考试;综合学校;综合性中学", "comprehensive", "[ˌkɒmprɪˈhensɪv]"));
        questions.add(new Question("n.\n" +
                "容量;性能;才能;生产能力\n" +
                "adj.\n" +
                "充其量的，最大限度的", "capacity", "[kəˈpæsəti]"));
        questions.add(new Question("n.\n" +
                "速率，速度;周转率;高速，快速", "velocity", " [vəˈlɒsəti]"));
        questions.add(new Question("n.\n" +
                "阻塞;充血;拥挤，堵车;（人口）过剩，稠密", "congestion", "[kənˈdʒestʃən]"));
        questions.add(new Question("n.\n" +
                "环境，周围的事物\n" +
                "adj.\n" +
                "周围的，附近的\n" +
                "v.\n" +
                "围绕;包围( surround的现在分词 );与…紧密相关;喜欢结交（某类人）", "surrounding", "[səˈraʊndɪŋ]"));
        questions.add(new Question("adv.\n" +
                "此外", "additionally", " [ə'dɪʃənəlɪ]"));
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
                "疾病;弊端;不安\n" +
                "vt.\n" +
                "传染;使…有病\n", "disease"));
        questions.add(new Question("n.\n" +
                "灾难;彻底的失败;不幸;祸患", "disaster"));
        questions.add(new Question.Builder("diary", "n.\n" +
                "日记，日志;日记簿", " [ˈdaɪəri] ").build());
        questions.add(new Question.Builder("desire", "vt.\n" +
                "渴望;希望;要求;请求\n" +
                "n.\n" +
                "欲望;愿望;希望;请求\n" +
                "vi.\n" +
                "愿望;有希望;期望;想望", " [dɪˈzaɪə(r)]").build());
        questions.add(new Question.Builder("destination", "n.\n" +
                "目的，目标;目的地，终点;[罕用语]预定，指定", " [ˌdestɪˈneɪʃn]").build());
        questions.add(new Question.Builder("drama", "n.\n" +
                "戏剧，剧本;戏剧效果;戏剧文学[艺术];戏剧性事件[场面]", "[ˈdrɑ:mə]").build());
        questions.add(new Question.Builder("comedy", "n.\n" +
                "喜剧;喜剧性;喜剧体裁;有趣的事情", "[ˈkɒmədi]").build());
        questions.add(new Question.Builder("gesture", "n.\n" +
                "手势，姿势;举止，动作;〔古语〕仪态;[计算机]光笔指令\n" +
                "vt.\n" +
                "做手势\n" +
                "vi.\n" +
                "用手势表现，表达或指导", " [ˈdʒestʃə(r)]").build());
        questions.add(new Question.Builder("graduate", "vi.\n" +
                "渐变;渐渐变为（与into连用）;渐渐消逝（与away连用）;取得资格（与as连用）\n" +
                "vt.\n" +
                "授予学位或毕业证书;从…接受学位;分成等级;标以刻度\n" +
                "n.\n" +
                "<美>毕业生;<英>大学毕业生;（已经取得学士学位正在攻读高级学位的）研究生;量筒\n" +
                "adj.\n" +
                "<美>毕业了的，研究生的;有（学士）学位的", "[ˈgrædʒuət]").build());
        questions.add(new Question.Builder("appropriate", "adj.\n" +
                "适当的;合适的;恰当的\n" +
                "v.\n" +
                "盗用;侵吞;拨（专款等）", "[əˈprəʊpriət]").build());
        questions.add(new Question.Builder("behavior", "n.\n" +
                "行为;态度;（机器等的）运转状态;（事物的）反应", "[bɪ'heɪvjə] ").build());
        questions.add(new Question.Builder("emergent", "adj.\n" +
                "紧急的;浮现的;突然出现的;自然发生的", "[iˈmɜ:dʒənt]").build());
        questions.add(new Question.Builder("mediator", "n.\n" +
                "调解人;调停者;传递者;中介物", "[ˈmi:dieɪtə(r)] ").build());
        questions.add(new Question.Builder("superiority", "n.\n" +
                "优越（性），优等;傲慢", "[su:ˌpɪəriˈɒrəti]").build());
        questions.add(new Question.Builder("slide", "vi.\n" +
                "滑落;下跌;打滑;[棒球]滑垒\n" +
                "vt.\n" +
                "衰落（成）;逐渐降低;使悄悄转动;（使）快捷而悄声地移动\n" +
                "n.\n" +
                "幻灯片;降低", "[slaɪd] ").build());
        questions.add(new Question.Builder("classification", "n.\n" +
                "分类;分级;类别;（动植物等的）分类学", "[ˌklæsɪfɪˈkeɪʃn]").build());
        questions.add(new Question.Builder("classify", "vt.\n" +
                "分类，归类;把…列为密件", "[ˈklæsɪfaɪ]").build());
        questions.add(new Question.Builder("fountain", "n.\n" +
                "泉源;人造喷泉，喷泉水;液体贮存器，汽水桶，冷饮柜;源头，来源", "[ˈfaʊntən]").build());
        questions.add(new Question.Builder("laundry", "n.\n" +
                "洗衣店，洗衣房;洗好的衣服;待洗的衣服;洗熨", "[ˈlɔ:ndri]").build());
        questions.add(new Question.Builder("lounge", "n.\n" +
                "客厅;休息厅;（机场等的）等候室\n" +
                "vi.\n" +
                "闲逛;懒洋洋地躺\n" +
                "vt.\n" +
                "懒洋洋地打发（时间）;虚度光阴", "[laʊndʒ]").build());
        questions.add(new Question.Builder("pizza", "n.\n" +
                "意大利薄饼，比萨饼", "[ˈpi:tsə]").build());
        questions.add(new Question.Builder("sailing", "n.\n" +
                "帆船运动;（乘帆船的）航行;（轮船的）航班\n" +
                "v.\n" +
                "驾驶( sail的现在分词);起航;坐船旅行;掠\n" +
                "adj.\n" +
                "航行的", "[ˈseɪlɪŋ]").build());
        questions.add(new Question.Builder("cycling", "n.\n" +
                "骑脚踏车兜风，骑脚踏车消遣", "[ˈsaɪklɪŋ]").build());
        questions.add(new Question.Builder("evidence", "n.\n" +
                "证据;迹象;证词;明显\n" +
                "vt.\n" +
                "表明;使明显;显示;证实", " [ˈevɪdəns]").build());
        questions.add(new Question.Builder("calculation", "n.\n" +
                "计算，盘算;估计;计算的结果;深思熟虑，慎重的计划\n", "[ˌkælkjuˈleɪʃn]").build());
        questions.add(new Question.Builder("journalist", "n.\n" +
                "新闻工作者，新闻记者;记日志者", "[ˈdʒɜ:nəlɪst]").build());
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
                "to twist and squeeze clothes, etc. in order to get the water out of them", "wring", " [rɪŋ] "));
        questions.add(new Question("vt.\n" +
                "推翻;摧毁，拆毁（建筑物等）;毁坏，破坏;驳倒（论点、理论等）", "demolish"));
        questions.add(new Question("n.\n" +
                "日历;历法;日程表;（一年之中的）重大事件（或重要日期）一览表\n" +
                "vt.\n" +
                "把…记入日程表中;把…列入表中;为（文件等）作分类索引;将…排入日程表", "calendar", "[ˈkælɪndə(r)]"));
        questions.add(new Question("n.\n" +
                "天堂;天;上帝;极乐", "heaven", "[ˈhevn]"));
        questions.add(new Question("n.\n" +
                "间隔;幕间休息;（数学）区间", "interval", "[ˈɪntəvl]"));
        questions.add(new Question("vt.& vi.\n" +
                "（使）滴下\n" +
                "vi.\n" +
                "滴出;含有;充满;充溢\n" +
                "n.\n" +
                "水滴;滴答，滴答滴答的声音;[医]点滴;点滴（的信息等）", "drip", " [drɪp]"));
        questions.add(new Question("n.\n" +
                "出现;到来;基督降临节（圣诞节前的四个星期）", "advent", "[ˈædvent] "));
        questions.add(new Question("adj.\n" +
                "内心的，精神的，思想的，心理的;智慧的，智[脑]力的;〈口〉精神病的，意志薄弱的，愚笨的\n" +
                "n.\n" +
                "精神病患者", "mental", "[ˈmentl]"));
        questions.add(new Question("n.\n" +
                "瑕疵，缺点;一阵狂风;短暂的风暴;裂缝，裂纹\n" +
                "v.\n" +
                "使生裂缝，使有裂纹;使无效;使有缺陷\n" +
                "vi.\n" +
                "生裂缝;变的有缺陷", "flaw", "[flɔ:]"));
        questions.add(new Question("vt.\n" +
                "构成，组成;制定，设立;等同于;指派", "constitute", " [ˈkɒnstɪtju:t] "));
        questions.add(new Question("n.\n" +
                "边缘;（悬崖峭壁的）边沿;（危险的）边沿;初始状态", "brink", " [brɪŋk]"));
        questions.add(new Question("n.\n" +
                "牙科医生", "dentist", " [ˈdentɪst]"));
        questions.add(new Question("n.\n" +
                "雕刻;雕刻品\n" +
                "v.\n" +
                "雕刻( carve的现在分词);分割", "carving", "  [ˈkɑ:vɪŋ] "));
        questions.add(new Question("n.\n" +
                "雕刻;雕刻品\n" +
                "v.\n" +
                "雕刻( carve的现在分词);分割", "carving", "  [ˈkɑ:vɪŋ] "));
        questions.add(new Question("vt.& vi.\n" +
                "（使）窘迫，（使）局促不安;（使）困难\n", "embarrass", "[ɪmˈbærəs]"));
        questions.add(new Question("adj.\n" +
                "灵活的;柔韧的;易弯曲的;易被说服的", "flexible", " [ˈfleksəbl]"));
        questions.add(new Question("vt.\n" +
                "引用，引证;[法]传讯;表扬;[军事]传（或通）令嘉奖\n" +
                "n.\n" +
                "<口>例证，引文", "cite", "[saɪt]"));
        questions.add(new Question("adj.\n" +
                "有责任的;有义务的;有…倾向的;易…的", "liable", "[ˈlaɪəbl]"));
        questions.add(new Question("n.\n" +
                "理发师;剪头或做头发的人", "hairdresser", " [ˈheədresə(r)] "));
        questions.add(new Question("n.\n" +
                "十几岁的青少年;十三岁到十九岁的少年", "teenager", "[ˈti:neɪdʒə(r)]"));
        questions.add(new Question("adj.\n" +
                "暴力引起的;剧烈的，（风，爆炸等）猛烈的，狂暴的;感情强烈的;颜色强烈的", "violent", "[ˈvaɪələnt]"));
        questions.add(new Question("n.\n" +
                "段落;分段符号\n" +
                "vt.\n" +
                "将…分段;写短文报导\n", "paragraph", "[ˈpærəgrɑ:f]"));
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
                "分散;散布;消散;驱散", "dispersal", " [dɪˈspɜ:sl] "));
        questions.add(new Question("adv.\n" +
                "非常;十足地;下流地;大略", "grossly", "[ˈgrəʊsli]"));
        questions.add(new Question("vt.\n" +
                "折磨;使受痛苦;使苦恼", "afflict", "[əˈflɪkt]"));
        questions.add(new Question("n.\n" +
                "泵;打气筒;轻软舞鞋;轻便帆布鞋（英式英语）\n" +
                "vt.& vi.\n" +
                "用抽水机汲水;给…打气;用泵（或泵样器官等）输送;涌出\n" +
                "vt.\n" +
                "用泵抽;注入，似用泵来拉、转或倒;抽水，从。。除去水;骑自行车的人上下蹬踏板", "pump", "[pʌmp]"));
        questions.add(new Question("n.\n" +
                "倾向，趋势;（话或作品等的）旨趣，意向;性情;癖好", "tendency", " [ˈtendənsi] "));
        questions.add(new Question("n.\n" +
                "预测;规划，设计;[心]投射;突起物", "projection", "[prəˈdʒekʃn] "));
        questions.add(new Question("adj.\n" +
                "有前途的;有为;有希望的;光明", "promising", " [ˈprɒmɪsɪŋ]"));
        questions.add(new Question("adj.\n" +
                "多余的，累赘的;（因人员过剩）被解雇的，失业的;重沓;衍", "redundant", "[rɪˈdʌndənt] "));
        questions.add(new Question("adj.\n" +
                "积分的;完整的;必须的\n" +
                "n.\n" +
                "积分;整体", "integral", " [ˈɪntɪgrəl] "));
        questions.add(new Question("vt.\n" +
                "完成;达到（目的）;走完（路程、距离等）;使完美", "accomplish", "[əˈkʌmplɪʃ]"));
        questions.add(new Question("adj.\n" +
                "有读写能力的;有文化修养的\n" +
                "n.\n" +
                "识字的人;有学问的人", "literate", "[ˈlɪtərət]]"));
        questions.add(new Question("vt.\n" +
                "对分;把…分成两半;把…减半;平摊", "halve", "[hɑ:v]"));
        questions.add(new Question("vt.\n" +
                "抑制，克制\n" +
                "n.\n" +
                "（诗歌的）叠句，副歌;经常重复的评价（或抱怨）\n" +
                "vi.\n" +
                "忍耐，节制", "refrain", " [rɪˈfreɪn]"));
        questions.add(new Question("vt.\n" +
                "嘲笑，奚落;用嘲笑刺激\n" +
                "n.\n" +
                "讥讽;嘲弄，奚落;嘲弄的对象，笑柄\n" +
                "adj.\n" +
                "[航]（桅杆）很高的", "taunt", "[tɔ:nt]"));
        questions.add(new Question("vt.& vi.\n" +
                "推，猛推\n" +
                "vt.\n" +
                "〈口〉乱放，乱塞;随手扔\n" +
                "n.\n" +
                "推，推开", "shove", " [ʃʌv]"));
        questions.add(new Question("vt.\n" +
                "（使）弯曲，屈身;拉弯;使成形，强行;集中全力于\n" +
                "vi.\n" +
                "偏向;使变曲，成角度;弯身，弯腰;专心\n" +
                "n.\n" +
                "弯道;弯曲（处）;（尤指道路或河流的）拐弯;（潜水员过快浮出水面造成的）减压病", "bend", "[bend]"));
        questions.add(new Question("vt.\n" +
                "强加;征税;以…欺骗\n" +
                "vi.\n" +
                "利用;欺骗;施加影响", "impose", " [ɪmˈpəʊz] "));
        questions.add(new Question("vn.\n" +
                "用具，装备;索具;阻挡;阻截队员\n" +
                "vt.\n" +
                "着手处理;[橄榄球]擒住并摔倒（一名对方球员）;给（马）配上挽具\n" +
                "vi.\n" +
                "擒住并摔倒一名对手", "tackle", "[ˈtækl] "));
        questions.add(new Question("vi.\n" +
                "符合;遵照;适应环境\n" +
                "vt.\n" +
                "使遵守;使一致;使顺从\n" +
                "adj.\n" +
                "一致的;顺从的", "conform", "[kənˈfɔ:m]"));
        questions.add(new Question("vt.\n" +
                "隐藏，隐瞒，遮住", "conceal", "[kənˈsi:l]"));
        questions.add(new Question("vt.\n" +
                "诊断;判断\n" +
                "vi.\n" +
                "做出诊断", "diagnose", "[ˈdaɪəgnəʊz]"));
        questions.add(new Question("adj.\n" +
                "微弱的，模糊的;软弱的;无勇气的;将昏倒似的\n" +
                "vi.\n" +
                "头晕，昏过去;渐渐不明，消失\n" +
                "n.\n" +
                "昏厥，昏倒", "faint", "[feɪnt]"));
        questions.add(new Question("n.\n" +
                "束;梁，栋梁;光线;（电波的）波束\n" +
                "vi.\n" +
                "发出光与热;面露喜色\n" +
                "vt.\n" +
                "播送;以梁支撑;用…照射;流露\n" +
                "vt.& vi.\n" +
                "笑容满面，眉开眼笑;发射电波，播送;放出束状的光（或热）", "beam", "[bi:m]"));
        questions.add(new Question("n.\n" +
                "混乱，凌乱;动乱，骚乱;不正当行为;（身心机能的）失调\n" +
                "vt.\n" +
                "使混乱，使凌乱;扰乱;使（身心等）失调;使（神经等）错乱", "disorder", "[dɪsˈɔ:də(r)] "));
        questions.add(new Question("vt.\n" +
                "产生;造成;引起\n" +
                "vi.\n" +
                "形成;引起\n", "engender", "[ɪnˈdʒendə(r)]"));
        questions.add(new Question("adj.\n" +
                "致命的，致死的;能致命的;破坏性的;有害的\n" +
                "n.\n" +
                "致死因子", "lethal", "[ˈli:θl]"));
        questions.add(new Question("adj.\n" +
                "耀眼的，闪闪发光的;炫耀的，显眼的;瞪眼的;粗俗的\n" +
                "v.\n" +
                "怒目而视(glare的现在分词);发强光", "glaring", " [ˈgleərɪŋ]"));
        questions.add(new Question("n.\n" +
                "后代，子孙;产物，结果;（动物的）崽;幼苗\n", "offspring", " [ˈɒfsprɪŋ]"));
        questions.add(new Question("vt.\n" +
                "居住;在…出现;填满\n" +
                "vi.\n" +
                "居住", "inhabit", "[ɪnˈhæbɪt]"));
        questions.add(new Question("n.\n" +
                "习惯，习性;气质;宗教服装\n" +
                "vt.\n" +
                "给…穿衣服;打扮", "habit","[ɪnˈhæbɪt]"));
        questions.add(new Question("vt.\n" +
                "呈现;陈列，展览;证明;[法]提交证据\n" +
                "vi.\n" +
                "展出;公开展览某物\n" +
                "n.\n" +
                "展览，陈列;展览品;公开展示;[法]证据", "exhibit", "[ɪgˈzɪbɪt] "));
        questions.add(new Question("n.\n" +
                "产地;（动物的）栖息地，住处;经常发现某种事物的地方", "habitat", "[ˈhæbɪtæt]"));
        questions.add(new Question("n.\n" +
                "承诺，许诺;委任，委托;致力，献身;承担义务", "commitment", "[kəˈmɪtmənt] "));
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
                "独立自主的人;无党派人士", "independent", "[ˌɪndɪˈpendənt] "));
        questions.add(new Question("vi.\n" +
                "测量土地\n" +
                "vt.\n" +
                "调查;勘测;俯瞰\n" +
                "n.\n" +
                "调查（表），调查所，测量，测量部，测量图;概观，检查，鉴定书;环顾", "survey", "[ˈsɜ:veɪ]"));
        questions.add(new Question("n.\n" +
                "陶器;陶器厂[作坊];<集合词>陶器类;陶器制造（术）", "pottery", "[ˈpɒtəri]"));
        questions.add(new Question("n.\n" +
                "偏爱;优先权;偏爱的事物;（债权人）受优先偿还的权利", "preference", "[ˈprefrəns] "));
        questions.add(new Question("n.\n" +
                "[化]朊，蛋白（质）\n" +
                "adj.\n" +
                "蛋白质的", "protein", "[ˈprəʊti:n]"));
        questions.add(new Question("n.\n" +
                "同事;同行;同僚", "colleague", "[ˈkɒli:g]"));
        questions.add(new Question("n.\n" +
                "出版;发表;出版物;公布\n", "publication", "[ˌpʌblɪˈkeɪʃn] "));
        questions.add(new Question("n.\n" +
                "质量，品质;美质，优点;才能，能力，技能，素养;品种\n" +
                "adj.\n" +
                "优质的，高质量的;上流社会的", "quality", "[ˈkwɒləti]"));
        questions.add(new Question("n.\n" +
                "四分之一;一刻钟;地区;（美式足球的）一节\n" +
                "vt.\n" +
                "把…四等分;供…住宿;使（士兵）驻扎", "quarter", "[ˈkwɔ:tə(r)] "));


        questions.add(new Question("n.\n" +
                "新兵;（机构中的）新成员;新学生\n" +
                "vt.\n" +
                "招聘，征募;吸收某人为新成员;动员…（提供帮助）;雇用\n" +
                "vi.\n" +
                "征募新兵;得到补充，得到补偿;恢复健康", "recruit", " [rɪˈkru:t]"));
        questions.add(new Question("n.\n" +
                "规则;管理;控制;规章\n" +
                "adj.\n" +
                "规定的，必须穿戴的，必须使用的", "regulation", "[ˌregjuˈleɪʃn]"));
        questions.add(new Question("n.\n" +
                "放宽;消遣，放松;松懈，松弛;[生理]驰松", "relaxation", "[ˌri:lækˈseɪʃn]"));
        questions.add(new Question("n.\n" +
                "钱包，钱袋;财力，财源;和包或钱袋相似的东西;女用小提包\n" +
                "vt.\n" +
                "使皱起，噘起", "purse", "[pɜ:s]", "a small bag made of leather, plastic, etc. for carrying coins and often also paper money, cards, etc., used especially by women"));
        questions.add(new Question("n.\n" +
                "隐私，秘密;隐居;私事;不受公众干扰的状态", "privacy", "[ˈprɪvəsi]"));
        questions.add(new Question("n.\n" +
                "预防，预防法;阻止，制止，妨碍，阻碍物;[谚]治病不如防病", "prevention", "[prɪˈvenʃn]"));
        questions.add(new Question("n.\n" +
                "香水;香料;香味，香气\n" +
                "vt.\n" +
                "使…充满香气;喷香水于…", "perfume", "[ˈpɜ:fju:m]"));
        questions.add(new Question("n.\n" +
                "生而为人;人格，人品，个性;人物;名人", "personality", "[ˌpɜ:səˈnæləti]"));


        questions.add(new Question("n.\n" +
                "演变;进化;发展", "evolution", "[ˌi:vəˈlu:ʃn]"));
        questions.add(new Question("n.\n" +
                "革命;旋转;彻底改变;运行，公转", "revolution", "[ˌrevəˈlu:ʃn]"));
        questions.add(new Question("n.\n" +
                "分辨率;解决;决心;坚决", "resolution", "[ˌrezəˈlu:ʃn]"));
        questions.add(new Question("n.\n" +
                "安全;保证，担保;保护，防护;有价证券\n" +
                "adj.\n" +
                "安全的，保安的，保密的", "security", "[sɪˈkjʊərəti]"));
        questions.add(new Question("n.\n" +
                "演讲;训斥，教训\n" +
                "vi.\n" +
                "作演讲\n" +
                "vt.\n" +
                "给…作演讲;教训（通常是长篇大论的）", "lecture", "[ˈlektʃə(r)]"));
        questions.add(new Question("n.\n" +
                "专题论文，学位论文;学术演讲", "dissertation", " [ˌdɪsəˈteɪʃn]"));
        questions.add(new Question("n.\n" +
                "参考;参考书;提及，涉及;证明人，介绍人\n" +
                "v.\n" +
                "引用;参照\n", "reference", "[ˈrefrəns]"));
        questions.add(new Question.Builder("suppress", "vt.\n" +
                "镇压，压制;止住，忍住;禁止发表;阻止…的生长（或发展）", "[səˈpres] ").build());
        questions.add(new Question.Builder("qualify", "vt.& vi.\n" +
                "（使）具有资格;有权;达标\n" +
                "vt.\n" +
                "限定，修饰;描述，形容;使合适;证明…合格\n" +
                "vi.\n" +
                "合格或成为合格;取得…的资格\n", "[ˈkwɒlɪfaɪ]").build());
        questions.add(new Question.Builder("admire", "vt.\n" +
                "欣赏;赞赏;称赞;<美口>想要", "[ədˈmaɪə(r)]").build());
        questions.add(new Question.Builder("convince", "vt.\n" +
                "使相信，说服，使承认;使明白;使确信;使悔悟，使认错[罪]", "[kənˈvɪns]").build());
        questions.add(new Question.Builder("courage", "n.\n" +
                "勇气;胆量;魄力;肝胆", " [ˈkʌrɪdʒ] ").build());
        questions.add(new Question.Builder("accommodation", "n.\n" +
                "住处;适应;和解;便利", " [əˌkɒməˈdeɪʃn] ").build());
        questions.add(new Question.Builder("decorate", "vt.\n" +
                "装饰;点缀;粉刷;授予（某人）勋章\n" +
                "vi.\n" +
                "装饰;布置", "[ˈdekəreɪt]").build());
        questions.add(new Question.Builder("neatly", "adv.\n" +
                "整洁地;干净地;灵巧地;恰好地", "[ni:tlɪ]").build());
        questions.add(new Question.Builder("engross", "vt.\n" +
                "使全神贯注", " [ɪnˈgrəʊs]").build());
        questions.add(new Question("vt.\n" +
                "联想;（使）发生联系;（使）联合;结交\n" +
                "vi.\n" +
                "联盟;陪伴同事\n" +
                "n.\n" +
                "合伙人;伴侣，同志;非正式会员\n" +
                "adj.\n" +
                "联合的;合伙的;非正式的;（性质上）有密切联系的", "associate", "[əˈsəʊʃieɪt]"));
        questions.add(new Question("n.\n" +
                "苗圃;婴儿室，幼儿园;临时托儿所;温床，滋生地", "nursery", "[ˈnɜ:səri]"));
        questions.add(new Question("n.\n" +
                "秘书;干事，书记员; 部长，大臣", "secretary", " [ˈsekrətri]"));
        questions.add(new Question("n.\n" +
                "皇帝，君主", "emperor", "[ˈempərə(r)]"));
        questions.add(new Question("n.\n" +
                "泥，泥淖;没价值的东西，污物;<美俚>咖啡;诽谤的话\n" +
                "vt.\n" +
                "抹泥;钻入泥中", "mud", "[mʌd]"));
        questions.add(new Question("n.\n" +
                "角;[比喻]（考虑、问题的）角度;观点;轮廓鲜明的突出体\n" +
                "vt.\n" +
                "使形成（或弯成）角度;把…放置成一角度;调整（或对准）…的角度;使（新闻、报道等）带有倾向性\n" +
                "vi.\n" +
                "垂钓;斜移;弯曲成一角度;从（某角度）报道", "angle", " [ˈæŋgl] "));
        questions.add(new Question("n.\n" +
                "安琪儿;天使，天使般的人;守护神;善良可爱的人", "angel", "[ˈeɪndʒl] "));
        questions.add(new Question("n.\n" +
                "灌溉;水利;[医]冲洗;冲注洗剂\n", "irrigation", "[ˌɪrɪ'ɡeɪʃn]"));
        return questions;
    }

    private List<Question> getDreamRepo() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question.Builder("merchant", "n.\n" +
                "商人;店主;批发商;零售商\n" +
                "adj.\n" +
                "商人的;商业的\n", "[ˈmɜ:tʃənt] ]").englishExplanation("a person who buys and sells goods in large quantities, especially one who imports and exports goods").build());
        questions.add(new Question.Builder("negotiate", "vi.\n" +
                "谈判，协商，交涉\n" +
                "vt.\n" +
                "谈判达成;成功越过;议价出售\n", " [nɪˈgəʊʃieɪt] ").build());
        questions.add(new Question.Builder("campaign", "n.\n" +
                "运动;战役;竞选运动;季节性竞赛\n" +
                "vi.\n" +
                "作战;参加[发起]运动，参加竞选;参战，参加战役", "[kæmˈpeɪn]").build());
        questions.add(new Question.Builder("fossil", "n.\n" +
                "化石;僵化的事物;老顽固，食古不化的人;习语中保存的旧词\n" +
                "adj.\n" +
                "化石的;陈腐的，守旧的", "[ˈfɒsl]").build());
        questions.add(new Question.Builder("insult", "vt.\n" +
                "辱骂;侮辱，凌辱;损害\n" +
                "n.\n" +
                "侮辱，凌辱;损害;无礼", " [ɪnˈsʌlt]").build());
        questions.add(new Question.Builder("prey", "n.\n" +
                "被捕食的动物;捕食（习性）;受害者;受骗者\n" +
                "vi.\n" +
                "捕食;（疾病等）使人慢慢衰弱;折磨;（人）靠欺诈为生", "[preɪ]").build());
        questions.add(new Question.Builder("pray", "vt.\n" +
                "祈祷，祷告;请求，恳求;央求\n" +
                "vi.\n" +
                "祈祷;请;恳求", "[preɪ]").build());
        questions.add(new Question.Builder("fancy", "vt.\n" +
                "设想;想要;猜想\n" +
                "n.\n" +
                "设想;想像力;爱好;怪想\n" +
                "adj.\n" +
                "（构思者）奇特的;昂贵的;（价格等）高价的;[美国俚语]真棒\n" +
                "vi.\n" +
                "想象，幻想", "[ˈfænsi]").build());
        questions.add(new Question.Builder("reckless", "adj.\n" +
                "鲁莽的，不顾危险的;粗心大意的;满不在乎的;胆大妄为", " [ˈrekləs]").build());
        questions.add(new Question.Builder("leap", "vi.\n" +
                "跳;冲动的行动\n" +
                "vt.\n" +
                "跳过，跃过;使跳跃\n" +
                "n.\n" +
                "跳跃，飞跃;跳跃的距离", "[li:p]").build());
        questions.add(new Question.Builder("grasp", "vt.\n" +
                "抓住;了解;急忙抓住;急切（或贪婪）地抓住\n" +
                "n.\n" +
                "控制;控制力;能力所及\n" +
                "vi.\n" +
                "攫取（常与 at 连用）;急于接受;急切地寻求（常与 for 连用）", " [grɑ:sp] ").build());
        questions.add(new Question.Builder("entice", "vt.\n" +
                "诱惑;怂恿", "[ɪnˈtaɪs]").build());
        questions.add(new Question.Builder("prone", "adj.\n" +
                "俯卧的;易于…的;有…倾向的;倾斜的，坡陡的", "[prəʊn]").build());
        questions.add(new Question.Builder("perceive", "v.\n" +
                "意识到;察觉，发觉", "[pəˈsi:v]").build());
        questions.add(new Question.Builder("valid", "adj.\n" +
                "有效的;有法律效力的;正当的;健全的", "[ˈvælɪd]").build());
        questions.add(new Question.Builder("transparent", "adj.\n" +
                "透明的;清澈的;易识破的;显而易见的", "[trænsˈpærənt] ").build());
        questions.add(new Question.Builder("intervention", "n.\n" +
                "介入，干涉，干预;调解，排解", "[ˌɪntə'venʃn]").build());
        questions.add(new Question.Builder("incidence", "n.\n" +
                "发生率;影响范围;[数]关联，接合;[物]入射，入射角", "[ˈɪnsɪdəns]").build());
        questions.add(new Question.Builder("distant", "adj.\n" +
                "遥远的;冷漠的，冷淡的;远离的，远隔的;不太清晰的", "[ˈdɪstənt]").build());
        questions.add(new Question.Builder("chop", "v.\n" +
                "切碎，砍;向下猛击;降低;终止\n" +
                "n.\n" +
                "排骨;砍，剁;掌劈;嘴周围的地方", "[tʃɒp]").build());
        questions.add(new Question.Builder("admit", "vt.& vi.\n" +
                "许可进入;承认，供认\n" +
                "vt.\n" +
                "允许;确认\n" +
                "vi.\n" +
                "承认;允许\n", "[ədˈmɪt]").build());
        questions.add(new Question.Builder("revise", "vt.\n" +
                "修订;修正;改变;[主英国英语]复习\n" +
                "vt.& vi.\n" +
                "复习\n" +
                "vi.\n" +
                "修订，校订\n" +
                "n.\n" +
                "修订;校订;[印刷]校样，清样;修订版，修订本\n", "[rɪˈvaɪz] ").build());
        questions.add(new Question.Builder("situation", "n.\n" +
                "（人的）情况;局面，形势，处境;位置;[心理学]情境\n", " [ˌsɪtʃuˈeɪʃn]").build());
        questions.add(new Question.Builder("usage", "n.\n" +
                "使用;用法;习惯;惯例", " [ˈju:sɪdʒ]]").build());
        questions.add(new Question.Builder("pattern", "n.\n" +
                "模式;图案;花样，样品;榜样，典范\n" +
                "vt.\n" +
                "模仿;以图案装饰\n" +
                "vi.\n" +
                "形成图案", " [ˈpætn]").build());
        questions.add(new Question.Builder("impair", "vt.\n" +
                "损害，削弱", "[ɪmˈpeə(r)] ").build());
        questions.add(new Question.Builder("disgust", "n.\n" +
                "反感，厌恶，嫌恶\n" +
                "vt.\n" +
                "使反感，厌恶\n", "[dɪsˈgʌst]").build());
        questions.add(new Question.Builder("infant", "n.\n" +
                "婴儿，幼儿;未成年人;初学者，生手\n" +
                "adj.\n" +
                "婴儿的，幼儿的;幼稚的，幼小的;初期的;未成年的", "[ˈɪnfənt]").build());
        questions.add(new Question.Builder("feeble", "adj.\n" +
                "虚弱的，衰弱的;无效的，无意的;缺乏决心的，缺乏活力的", " [ˈfi:bl]").build());
        questions.add(new Question.Builder("prevalent", "adj.\n" +
                "流行的，盛行的;普遍存在的，普遍发生的", "[ˈprevələnt]").build());
        questions.add(new Question.Builder("relevant", "adj.\n" +
                "有关的，中肯的;相关联的;确切的;有重大意义[作用]的，实质性的", "[ˈreləvənt]").build());
        questions.add(new Question.Builder("renown", "n.\n" +
                "名望，声誉;威名;声威", " [rɪˈnaʊn] ").build());
        questions.add(new Question.Builder("assert", "vt.\n" +
                "声称，断言;维护，坚持;坚持自己的主张;生效", " [əˈsɜ:t]").build());
        questions.add(new Question.Builder("carve", "vi.\n" +
                "雕刻;切，切开;创制，开创\n" +
                "vt.\n" +
                "雕塑;切片", "[kɑ:v]").build());
        questions.add(new Question.Builder("dormant", "adj.\n" +
                "潜伏的，蛰服的，休眠的;静止的;资金没有利用的;权利尚待争取的", "[ˈdɔ:mənt] ").build());
        questions.add(new Question.Builder("drill", "n.\n" +
                "钻头;操练;军事训练;（应对紧急情况的）演习\n" +
                "vt.& vi.\n" +
                "训练;操练;钻（孔）;打（眼）\n" +
                "vt.\n" +
                "作…演习，操练", " [drɪl]").build());
        questions.add(new Question.Builder("contest", "vt.\n" +
                "竞争，为…而奋争;辩驳\n" +
                "vi.\n" +
                "竞争;争夺;争斗\n" +
                "n.\n" +
                "比赛;竞赛;搏斗", " [ˈkɒntest] ").build());
        questions.add(new Question.Builder("engagement", "n.\n" +
                "约会;订婚，婚约;约定，契约;雇用", "[ɪnˈgeɪdʒmənt]").build());
        questions.add(new Question.Builder("fear", "n.\n" +
                "害怕;可能性;（对神等的）敬畏;忧虑\n" +
                "vt.\n" +
                "害怕;畏惧;为…忧虑（或担心、焦虑）;敬畏（神等）\n" +
                "vi.\n" +
                "害怕;惧怕;忧虑;感到害怕\n", "[fɪə(r)]").build());
        questions.add(new Question.Builder("keen", "adj.\n" +
                "锐利的;厉害的，强烈的;敏锐的，敏捷的;热心的\n" +
                "vi.\n" +
                "（为死者）恸哭，哀号\n" +
                "n.\n" +
                "〈英〉号哭，恸哭\n", "[ki:n]").build());
        questions.add(new Question.Builder("balcony", "n.\n" +
                "阳台;包厢;（电影院等的）楼厅，楼座", "[ˈbælkəni]").build());
        questions.add(new Question.Builder("deserve", "vt.\n" +
                "值得;应得;应受\n" +
                "vi.\n" +
                "应受报答;应得报酬;应得赔偿;应受惩罚\n", "[dɪˈzɜ:v]").build());
        questions.add(new Question.Builder("thwart", "vt.\n" +
                "阻挠;挫败;使受挫折;<旧>横过\n" +
                "n.\n" +
                "<船>横座板，划手座，独木舟的横梁\n" +
                "adj.\n" +
                "横放的，横着的，穿过的;<旧>执拗的，固执的\n" +
                "adv.\n" +
                "<古>横跨着，横过\n" +
                "prep.\n" +
                "<古>横跨，横过", "[θwɔ:t]").build());
        questions.add(new Question.Builder("besiege", "vt.\n" +
                "包围，为敌对势力包围;拥挤在周围，包围住;如被询问纠缠或强求;使感到丧气或焦虑", "[bɪˈsi:dʒ]").build());
        questions.add(new Question.Builder("undaunted", "adj.\n" +
                "顽强的，不惧怕的，无畏的", " [ˌʌnˈdɔ:ntɪd] ").build());
        questions.add(new Question.Builder("invective", "n.\n" +
                "痛骂，猛烈抨击", "[ɪnˈvektɪv]").build());
        questions.add(new Question.Builder("exempt", "vt.\n" +
                "使免除，豁免\n" +
                "adj.\n" +
                "被免除的，被豁免的\n" +
                "n.\n" +
                "被免除（义务，责任）的人;免税人", "[ɪgˈzempt] ").build());
        questions.add(new Question.Builder("propound", "vt.\n" +
                "提出（问题、计划等）供考虑[讨论]，提议", "[prəˈpaʊnd]").build());
        questions.add(new Question.Builder("parch", "vt.& vi.\n" +
                "（使）焦干， （使）干透\n" +
                "vt.\n" +
                "使（某人）极口渴", "[pɑ:tʃ]").build());
        questions.add(new Question.Builder("dye", "n.\n" +
                "染料，染色;颜色\n" +
                "vt.\n" +
                "染色;给…染色\n" +
                "vi.\n" +
                "染上或粘上（颜色）", "[daɪ]").build());
        questions.add(new Question.Builder("cluster", "n.\n" +
                "群;丛;簇，串;[语言]辅音群\n" +
                "vi.\n" +
                "丛生;群聚\n" +
                "vt.\n" +
                "使密集，使聚集", "[ˈklʌstə(r)] ").build());
        return questions;
    }

    private List<Question> getPersonRepo() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("n.\n" +
                "臀部;[建筑学]屋脊;臀围（尺寸）;臀部…的\n" +
                "adj.\n" +
                "（衣服、音乐等方面）时髦的，赶时髦的\n" +
                "vt.\n" +
                "使…的髋关节脱臼，损伤…的髋部;[建筑学]给（房屋）建屋脊;使知晓，使了解，告诉;使消息灵通", "hip", " [hɪp]"));
        questions.add(new Question.Builder("thigh", "n.\n" +
                "股，大腿;食用的鸡（等的）腿", "[θaɪ] ").build());
        questions.add(new Question.Builder("jaw", "n.\n" +
                "下巴;颌;唠叨;狭窄入口\n" +
                "vi.\n" +
                "闲谈;唠唠叨叨，喋喋不休;教训", "[dʒɔ:]").build());
        questions.add(new Question.Builder("elbow", "n.\n" +
                "肘部;弯头，扶手;肘形管，弯管\n" +
                "vt.\n" +
                "用肘推挤（另一人或另一些人）;用手肘推开\n" +
                "vi.\n" +
                "用肘推搡着前进;在拐角处转弯", "[ˈelbəʊ]").build());
        questions.add(new Question.Builder("stomach", "n.\n" +
                "胃;腹部;食欲;欲望\n" +
                "vt.\n" +
                "容忍;吃…吃得津津有味;〈古〉对…发怒\n", "[ˈstʌmək]").build());
        questions.add(new Question.Builder("lung", "n.\n" +
                "肺;呼吸器官;[医]辅助呼吸的装置;〈英〉可供呼吸新鲜空气的地方", "[lʌŋ]").build());
        questions.add(new Question.Builder("neck", "n.\n" +
                "颈，脖子;衣领;海峡;[地]岩颈\n" +
                "vi.\n" +
                "搂着脖子亲吻，相拥互吻;变狭窄\n" +
                "vt.\n" +
                "使变细;与…搂著脖子亲吻;割颈杀死（家禽等）", "[nek]").build());
        questions.add(new Question.Builder("belly", "n.\n" +
                "肚子，腹部;（物体的）圆形或凸起部份;胃口，食欲;腹部…形的\n" +
                "vt.& vi.\n" +
                "膨胀", "[ˈbeli]").build());
        questions.add(new Question.Builder("crus", "n.\n" +
                "小腿，后腿的，似小腿或后腿形状的构造", " [kru:]").build());
        questions.add(new Question.Builder("wrist", "n.\n" +
                "腕关节;腕，手腕;（衣袖等的）腕部", "[rɪst]").build());
        questions.add(new Question.Builder("artery", "n.\n" +
                "[解剖]动脉;干线，要道", "[ˈɑ:təri]").build());
        questions.add(new Question.Builder("vein", "n.\n" +
                "静脉;[地]矿脉，岩脉;[植]叶脉;气质，倾向\n" +
                "v.\n" +
                "使有脉络;使有纹理;象脉络般分布于", "[veɪn]").build());
        questions.add(new Question.Builder("molecule", "n.\n" +
                "分子;微小颗粒", " [ˈmɒlɪkju:l]").build());
        questions.add(new Question.Builder("atom", "n.\n" +
                "原子;原子能;微粒，微量\n", "[ˈætəm]").build());
        questions.add(new Question.Builder("organ", "n.\n" +
                "器官;机构;风琴;元件", "[ˈɔ:gən]").build());

        questions.add(new Question.Builder("optimistic", "adj.\n" +
                "乐观的，乐观主义的", "[ˌɒptɪˈmɪstɪk]").build());
        questions.add(new Question.Builder("pessimistic", "adj.\n" +
                "悲观主义的;悲观的，厌世的", "[ˌpesɪˈmɪstɪk]").build());
        questions.add(new Question.Builder("humour", "n.\n" +
                "幽默;幽默感 ;感觉;体液\n" +
                "v.\n" +
                "迁就;顺应\n", "[ˈhju:mə(r)]").build());
        questions.add(new Question.Builder("loyal", "adj.\n" +
                "忠贞的;忠诚的，忠心的\n" +
                "n.\n" +
                "效忠的臣民;忠实信徒\n", "[ˈlɔɪəl]").build());
        questions.add(new Question.Builder("sympathetic", "adj.\n" +
                "同情的，有同情心的;赞同的;相投合的，称心的;〈口〉抱好感的", "[ˌsɪmpəˈθetɪk]").build());
        questions.add(new Question.Builder("selfish", "adj.\n" +
                "自私的，利己的", "[ˈselfɪʃ]").build());
        questions.add(new Question.Builder("selfless", "adj.\n" +
                "大公无私;无私的，忘我的;公而忘私", "[ˈselfləs] ").build());
        questions.add(new Question.Builder("modest", "adj.\n" +
                "谦虚的，谦逊的;适度的，适中的;端庄的;羞怯的\n", " [ˈmɒdɪst]").build());
        questions.add(new Question.Builder("cunning", "adj.\n" +
                "狡猾的;灵巧的;奸诈的\n" +
                "n.\n" +
                "狡猾;狡黠;诡诈", " [ˈkʌnɪŋ]").build());
        questions.add(new Question.Builder("modest", "adj.\n" +
                "谦虚的，谦逊的;适度的，适中的;端庄的;羞怯的", "[ˈmɒdɪst] ").build());
        questions.add(new Question.Builder("introvert", "n.\n" +
                "性格内向的人", "[ˈɪntrəvɜ:t]").build());
        questions.add(new Question.Builder("extrovert", "n.\n" +
                "外向;性格外向的人;<口>活跃、愉快、爱交际的人", "[ˈekstrəvɜ:t]").build());

        questions.add(new Question.Builder("swallow", "vt.& vi.\n" +
                "吞，咽;忍耐，忍受\n" +
                "vt.\n" +
                "不流露;<口>忍受，轻信\n" +
                "n.\n" +
                "[鸟]燕子;胃管，食道;一次吞咽的量;（滑车等的）通索孔\n", "[ˈswɒləʊ] ").build());
        questions.add(new Question.Builder("crawl", "vi.\n" +
                "爬行;缓慢行进;巴结\n" +
                "n.\n" +
                "缓慢的爬行;〈美俚〉跳舞，自由式游泳;养鱼（龟）池\n", "[krɔ:l]").build());
        questions.add(new Question.Builder("stagger", "vi.\n" +
                "蹒跚;动摇;犹豫\n" +
                "vt.\n" +
                "使蹒跚，使摇摆;使犹豫;错开时间;使吃惊\n" +
                "n.\n" +
                "摇晃;一种不稳定形式，部署或者秩序;摇摆不定", "[ˈstægə(r)] ").build());
        questions.add(new Question.Builder("vomit", "vt.& vi.\n" +
                "呕吐;大量喷出\n" +
                "n.\n" +
                "呕吐，呕吐物;催吐剂\n", " [ˈvɒmɪt]").build());
        questions.add(new Question.Builder("plug", "n.\n" +
                "插头;塞子;消防栓;（内燃机的）火花塞\n" +
                "vt.& vi.\n" +
                "插上插头\n" +
                "vt.\n" +
                "插入;以（塞子）塞住;〈俚〉枪击，殴打\n" +
                "vi.\n" +
                "填塞，堵;〈俚〉勤苦工作，用功\n", "[plʌg]").build());
        questions.add(new Question.Builder("spit", "vt.\n" +
                "吐，吐出\n" +
                "n.\n" +
                "口水;唾沫;烤肉叉\n" +
                "vi.\n" +
                "吐痰，吐口水;发出劈啪声\n", "[spɪt]").build());
        questions.add(new Question.Builder("righteous", "adj.\n" +
                "正义的;正直的;公正的", "[ˈraɪtʃəs] ").build());
        questions.add(new Question.Builder("humble", "adj.\n" +
                "谦逊的;简陋的;（级别或地位）低下的;不大的\n" +
                "vt.\n" +
                "使谦恭;轻松打败（尤指强大的对手）;低声下气", "[ˈhʌmbl]").build());
        questions.add(new Question.Builder("gaunt", "adj.\n" +
                "憔悴的;骨瘦如柴的;荒凉的\n" +
                "n.\n" +
                "憔悴，荒凉", "[gɔ:nt]").build());
        return questions;
    }

    private List<Question> getIELTSReadingRepo3() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question.Builder("supremacy", "n.\n" +
                "霸权;至高无上;最高权力;最高地位", "[su:ˈpreməsi]").build());
        questions.add(new Question.Builder("supersede", "vt.\n" +
                "取代，接替;更替，继任;将…免职，撤换\n" +
                "vi.\n" +
                "推迟行动\n" +
                "v.\n" +
                "废除，废弃", "[ˌsu:pəˈsi:d]").build());
        questions.add(new Question.Builder("steer", "vt.& vi.\n" +
                "引导;驾驶;操纵，控制\n" +
                "vt.\n" +
                "掌（舵）\n" +
                "vi.\n" +
                "行进\n" +
                "n.\n" +
                "阉公牛，肉用公牛;〈美俚〉建议;关于行路（或驾驶）的指示", "[stɪə(r)]").build());
        questions.add(new Question.Builder("succumb", "vi.\n" +
                "屈服;死亡", "[səˈkʌm]").build());
        questions.add(new Question.Builder("symptom", "n.\n" +
                "症状;征兆", "[ˈsɪmptəm]").build());
        questions.add(new Question.Builder("toll", "n.\n" +
                "通行费;伤亡人数;钟声;长途电话费\n" +
                "v.\n" +
                "鸣钟;敲钟", "[təʊl]").build());
        questions.add(new Question.Builder("transcend", "vt.\n" +
                "超越，超出…的限度;优于或胜过…;高于或独立于（宇宙）而生存\n", " [trænˈsend]").build());
        questions.add(new Question.Builder("vulnerable", "adj.\n" +
                "（地方）易受攻击的;易受伤的;易受批评的;[桥牌]已成局的", " [ˈvʌlnərəbl] ").build());
        questions.add(new Question.Builder("gist", "n.\n" +
                "要领;精神;要点，主旨;大要", "[dʒɪst]").build());
        questions.add(new Question.Builder("spark", "n.\n" +
                "电火花;燃烧的颗粒;火星，火花，余火;（金属的）发光的颗粒\n" +
                "vi.\n" +
                "发出火星，发出闪光;热烈赞同;正常运转\n" +
                "vt.\n" +
                "发动，触发;激起运动，鼓舞\n", "[spɑ:k]").build());
        questions.add(new Question.Builder("controversy", "n.\n" +
                "论战;公开辩论", "[ˈkɒntrəvɜ:si]").build());
        questions.add(new Question.Builder("divergent", "adj.\n" +
                "发散的;有分歧的;叉开的;扩散的", "[daɪ'vɜ:dʒənt]").build());
        questions.add(new Question.Builder("denote", "vt.\n" +
                "代表;指代;预示;意思是", "[dɪˈnəʊt]").build());
        questions.add(new Question.Builder("recreation", "n.\n" +
                "消遣（方式）;娱乐（方式）;重建，重现", "[ˌrekriˈeɪʃn] ").build());
        questions.add(new Question.Builder("contradiction", "n.\n" +
                "矛盾;否认，反驳", " [ˌkɒntrəˈdɪkʃn] ").build());
        questions.add(new Question.Builder("criminal", "n.\n" +
                "罪犯，犯人\n" +
                "adj.\n" +
                "犯罪的;刑事的;可耻的\n", "[ˈkrɪmɪnl]").build());
        questions.add(new Question.Builder("undergo", "vt.\n" +
                "经历，经验;遭受，承受", " [ˌʌndəˈgəʊ] ").build());
        questions.add(new Question.Builder("cultivate", "vt.\n" +
                "树立，耕作，种植;教养，栽培;改善;交朋友", "[ˈkʌltɪveɪt]  ").build());
        questions.add(new Question.Builder("inherent", "adj.\n" +
                "天生;固有的，内在的", "[ɪnˈhɪərənt]").build());
        questions.add(new Question.Builder("reticence", "n.\n" +
                "沉默;含蓄;不轻易暴露想法或感情;不爱说话", " ['retɪsns]").build());
        questions.add(new Question.Builder("passionate", "adj.\n" +
                "激昂的;热烈的;易怒的;易被情欲所支配的\n", "[ˈpæʃənət] ").build());
        questions.add(new Question.Builder("untangle", "vt.\n" +
                "整顿;解开（某物的）结;使不再打结;解决（纠纷等）", " [ˌʌnˈtæŋgl] ").build());
        questions.add(new Question.Builder("miserable", "adj.\n" +
                "悲惨的;令人痛苦的;太少的;卑鄙的", " [ˈmɪzrəbl]").build());
        questions.add(new Question.Builder("compatible", "adj.\n" +
                "兼容的，相容的;和谐的，协调的;[生物学]亲和的;可以并存的，能共处的", "[kəmˈpætəbl] ").build());
        questions.add(new Question.Builder("obligation", "n.\n" +
                "债务;义务，责任;证券，契约;恩惠", "[ˌɒblɪˈgeɪʃn] ").build());
        questions.add(new Question.Builder("menace", "n.\n" +
                "威胁;恐吓\n" +
                "vt.&vi.\n" +
                "威胁;恐吓", "[ˈmenəs] ").build());
        questions.add(new Question.Builder("hardship", "n.\n" +
                "艰难;困苦;艰难情况;造成困苦与苦难的原因", "[ˈhɑ:dʃɪp] ").build());
        questions.add(new Question.Builder("hypothesis", "n.\n" +
                "假设，假说;[逻]前提", "[haɪˈpɒθəsɪs]").build());
        questions.add(new Question.Builder("indulge", "vt.\n" +
                "迁就，纵容;使满足;使（自己）沉溺于;使快乐\n" +
                "vi.\n" +
                "沉溺;纵容;满足", "[ɪnˈdʌldʒ] ").build());
        questions.add(new Question.Builder("lopsided", "adj.\n" +
                "不平等的;两侧不匀称[不平衡]的，向一侧歪斜的;畸", "[ˌlɒpˈsaɪdɪd]").build());
        questions.add(new Question.Builder("norm", "n.\n" +
                "规范;标准;准则;（劳动）定额", "[nɔ:m]").build());
        questions.add(new Question.Builder("optimum", "adj.\n" +
                "最适宜的\n" +
                "n.\n" +
                "最佳效果;最适宜条件;[生物学] 最适度", "[ˈɒptɪməm]").build());
        questions.add(new Question.Builder("plot", "n.\n" +
                "地基，基址图;（戏剧、小说等的）情节;一块地;测算表\n" +
                "vt.\n" +
                "密谋;以图表画出，制图;把…分成小块;为（文学作品）设计情节\n" +
                "vi.\n" +
                "设计作品情节;标示于图表上;密谋，暗中策划\n", " [plɒt] ").build());
        questions.add(new Question.Builder("portable", "adj.\n" +
                "轻便的;手提的\n" +
                "n.\n" +
                "手提式打字机", "[ˈpɔ:təbl]").build());
        questions.add(new Question.Builder("paramount", "adj.\n" +
                "最高的，至上的;最重要的，主要的;卓越的;有最高权力的\n" +
                "n.\n" +
                "最高，至上;有最高权力的人;元首，首长", "[ˈpærəmaʊnt]").build());
        questions.add(new Question.Builder("cylinder", "n.\n" +
                "汽缸;圆筒，圆柱;（尤指用作容器的）圆筒状物", "[ˈsɪlɪndə(r)] ").build());
        questions.add(new Question.Builder("ascribe", "vt.\n" +
                "把…归于，认为…是由于;认为…具有", "[əˈskraɪb]").build());
        questions.add(new Question.Builder("rot", "n.\n" +
                "腐烂，腐朽\n" +
                "vt.& vi.\n" +
                "（使）腐烂，（使）腐朽\n", "[rɒt]").build());
        questions.add(new Question.Builder("discard", "vt.\n" +
                "丢弃，抛弃;解雇;出牌\n" +
                "n.\n" +
                "被抛弃的人[物];丢弃，抛弃;打出的牌;打出的牌\n" +
                "vi.\n" +
                "出无用的牌;垫牌", "[dɪsˈkɑ:d]").build());
        questions.add(new Question.Builder("recession", "n.\n" +
                "经济衰退，不景气;后退，撤退;凹处;退场", "[rɪˈseʃn]").build());
        questions.add(new Question.Builder("vice", "n.\n" +
                "恶习;不道德行为;（肉体的）缺陷，疾病;（文体等的）缺点，瑕疵\n" +
                "prep.\n" +
                "代替;取代\n" +
                "adj.\n" +
                "副的;代替的\n" +
                "vt.\n" +
                "用老虎钳夹紧;钳制\n", "[vaɪs]").build());
        questions.add(new Question.Builder("dismantle", "vt.\n" +
                "拆卸;拆开;废除;取消", "[dɪsˈmæntl]").build());
        questions.add(new Question.Builder("immense", "adj.\n" +
                "极大的，巨大的;浩瀚的，无边际的;〈口〉非常好的;弘道", " [ɪˈmens]").build());
        questions.add(new Question.Builder("volume", "n.\n" +
                "体积;卷;音量;量，大量\n" +
                "adj.\n" +
                "大量的\n" +
                "vi.\n" +
                "成团卷起\n" +
                "vt.\n" +
                "把…收集成卷\n", "[ˈvɒlju:m]").build());
        questions.add(new Question.Builder("pragmatic", "adj.\n" +
                "实用主义的;实际的;好管闲事的;国事的\n" +
                "n.\n" +
                "爱管闲事的人;专断的人;国事诏书;实务家", "[prægˈmætɪk]").build());
        questions.add(new Question.Builder("expedient", "adj.\n" +
                "应急有效的，权宜之计的;方便的，便利的，有利的\n" +
                "n.\n" +
                "应急办法，权宜之计\n", "[ɪkˈspi:diənt]").build());
        questions.add(new Question.Builder("staircase", "n.\n" +
                "楼梯;楼梯间", " [ˈsteəkeɪs]").build());
        questions.add(new Question.Builder("greed", "n.\n" +
                "贪婪;贪心", "[gri:d]").build());
        questions.add(new Question.Builder("sparse", "adj.\n" +
                "稀疏的;稀少的", "[spɑ:s]").build());
        questions.add(new Question.Builder("scrape", "vt.\n" +
                "擦，刮;擦去;擦伤，刮破;挖空\n" +
                "vi.\n" +
                "刮，擦;搔，抓;掏;发出刺耳的声音\n" +
                "n.\n" +
                "擦，刮;刮痕;刮擦声;刮胡子，修面\n", "[skreɪp] ").build());
        return questions;
    }

    private List<Question> getAniVet() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question.Builder("vegetable", "n.\n" +
                "蔬菜", "[ˈvedʒtəbl]]").build());
        questions.add(new Question.Builder("potato", "n.\n" +
                "马铃薯， 土豆，洋芋;土豆块茎", "[pəˈteɪtəʊ]").build());
        questions.add(new Question.Builder("tomato", "n.\n" +
                "番茄，西红柿;[俚语] 美女", "[təˈmɑ:təʊ]").build());
        questions.add(new Question.Builder("eggplant", "n.\n" +
                "茄子", " [ˈegplɑ:nt]").build());
        questions.add(new Question.Builder("watermelon", "n.\n" +
                "西瓜", "[ˈwɔ:təmelən]").build());
        questions.add(new Question.Builder("cheese", "n.\n" +
                "奶酪;<俚>微笑\n" +
                "vt.\n" +
                "<俚>停止", "[tʃi:z] ").build());
        questions.add(new Question.Builder("mushroom", "n.\n" +
                "蘑菇;蘑菇状物，蘑菇形物体;（女用）蘑菇形草帽;暴发户\n" +
                "adj.\n" +
                "蘑菇的;蘑菇形的;迅速生长的;雨后蘑菇似的\n" +
                "vi.\n" +
                "迅速增长;采蘑菇;迅速增加;（火）猛然的扩大", "[ˈmʌʃrʊm]").build());

        questions.add(new Question.Builder("mouse", "n.\n" +
                "鼠标;老鼠;羞怯[胆小]的人;[非正式用语] 眼部青肿\n" +
                "vi.\n" +
                "捕鼠;窥探，偷偷地寻找\n", " [maʊs]").build());
        questions.add(new Question.Builder("camel", "n.\n" +
                "骆驼", "[ˈkæml]").build());
        questions.add(new Question.Builder("spider", "n.\n" +
                "蜘蛛;星形轮，十字叉;带柄三脚平底锅;三脚架", "[ˈspaɪdə(r)]").build());
        questions.add(new Question.Builder("duck", "n.\n" +
                "鸭肉;鸭子，野鸭;（表示友好的称呼）乖乖;（板球）零分\n" +
                "vt.& vi.\n" +
                "躲避，回避;潜入;忽然低下头（或弯下腰）;迅速行进", "[dʌk]").build());


        questions.add(new Question.Builder("spicy", "adj.\n" +
                "辛辣的;加有香料的，香的;有刺激性的;（故事等）猥亵的，下流的", "[ˈspaɪsi]").build());


        questions.add(new Question.Builder("physics", "n.\n" +
                "物理学;物理现象;物理成分", "[ˈfɪzɪks]").build());
        questions.add(new Question.Builder("psychology", "n.\n" +
                "心理学;心理状态;心理特点;心理影响", "[saɪˈkɒlədʒi]").build());
        questions.add(new Question.Builder("chemistry", "n.\n" +
                "化学;物质的化学组成（或性质），化学作用（现象）;（常指有强烈性吸引力的）两人间的关系;〈比喻〉神秘的变化（过程）\n", " [ˈkemɪstri] ").build());
        questions.add(new Question.Builder("biology", "n.\n" +
                "生物学;生物", "[baɪˈɒlədʒi]").build());
        questions.add(new Question.Builder("geometry", "n.\n" +
                "几何学;几何形状;几何图形;几何学著作", "[dʒiˈɒmətri]").build());

        questions.add(new Question.Builder("oxygen", "n.\n" +
                "[化]氧，氧气", "[ˈɒksɪdʒən]").build());
        questions.add(new Question.Builder("carbon", "n.\n" +
                "[化学]碳;（一张）复写纸;[电]碳精棒[片，粉]，碳精电极;复写的副本\n" +
                "adj.\n" +
                "碳的;碳处理的", "[ˈkɑ:bən] ").build());
        questions.add(new Question.Builder("dioxide", "n.\n" +
                "[化]二氧化物", "[daɪˈɒksaɪd]").build());
        return questions;

    }

    private List<Question> getOftenErrorRepo3() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question.Builder("structure", "n.\n" +
                "结构;构造;建筑物;体系\n" +
                "vt.\n" +
                "构成，排列;安排\n", "[ˈstrʌktʃə(r)] ").build());
        questions.add(new Question.Builder("solution", "n.\n" +
                "溶液;解决;溶解;答案", " [səˈlu:ʃn]").build());
        questions.add(new Question.Builder("probably", "adv.\n" +
                "大概;或许;很可能;备不住", "[ˈprɒbəbli]").build());
        return questions;
    }


}
