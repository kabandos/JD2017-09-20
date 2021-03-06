package by.it.halai.jd01_06;

/**
 * @author Vitaly Halai
 */
public class Runner {
    public static void main(String[] args) {

        //A.1.
        //В каждом слове текста 4-ю и 7-ю буквы заменить символом #. Для слов короче 4 символов корректировку
        //не выполнять. Для слов короче 7 символов заменять только 4-ю букву.
        System.out.println("Задача А.1.");
        TaskA.solveTaskA1();
        System.out.println();

        //A.2.
        //Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
        System.out.println("Задача А.2.");
        TaskA.solveTaskA2();
        System.out.println();

        //B.1. В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.
        //(удобно сделать для этого отдельный метод)
        System.out.println("Задача В.1.");
        System.out.println();
        TaskB.solveTaskB1();
        System.out.println();

        //B.2. Вывести все предложения заданного текста в порядке возрастания количества слов(!) в каждом из них.
        //В предложениях нужно убрать переносы строк.
        System.out.println();
        System.out.println("Задача В.2.");
        System.out.println();
        TaskB.solveTaskB2();
        System.out.println();
    }
}
