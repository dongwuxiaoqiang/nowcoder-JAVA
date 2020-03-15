import java.util.ArrayList;
import java.util.List;

/**
 * 题目描述：假设农场中成熟的母牛每年都会生 1 头小母牛，并且永远不会死。第一年有 1 只小母牛，从第二年开始，母牛开始生小母牛。每只小母牛 3 年之后成熟又可以生小母牛。给定整数 N，求 N 年后牛的数量。
 * <p>
 * 第 i 年成熟的牛的数量为：
 *
 * @Author: yzw
 * @Email: 474497857@qq.com
 * @Date: 2020/3/13 9:40 下午
 */
public class 母牛生产 {
    static class Cow {
        private int age = 1;

        public Cow getCow() {
            if (this.age < 3) {
                this.age++;
                return null;
            }
            return new Cow();
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        int n = 1;

        List<Cow> cows = new ArrayList<>();

        Cow cow = new Cow();
        cow.setAge(0);
        cows.add(cow);

        for (int i = 0; i < n; i++) {
            Cow c = cows.get(i).getCow();
            if (c != null) {
                cows.add(c);
            }
        }

    }
}
