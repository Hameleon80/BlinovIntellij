package chapter6.publication;

/**
 * Ahtirskij Yuriy 10.08.2021
 */
public class Runner {
    public static void main(String[] args) {
        Encyclopedia animals=new Encyclopedia("World of animals", "Ben Chill", "Эта книга позволит тебе совершить увлекательное путешествие по миру. В высоких горах ты встретишься с ламами и горными баранами\n, в бескрайних знойных пустынях тебя поджидают скорпионы и верблюды, в покрытых льдами Арктике и Антарктике \n- пингвины и белые медведи, в морских и океанских глубинах ты увидишь дельфинов и скатов, а в саваннах - львов и слонов.\n Занимательные вопросы позволят юным биологам проявить эрудицию и узнать множество любопытных фактов о разных представителях\n царства животных - от пауков и хамелеонов до бегемотов и орангутангов.", 1500);
        animals.showInfo();
    }
}
