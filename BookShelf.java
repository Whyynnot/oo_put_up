import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookShelf {
    private BigDecimal SumPrice = BigDecimal.valueOf(0);
    private Map<String, Bookset> Book_Shelf = new HashMap<>();
    private double MaxPrice = 0;
    private BigInteger SumNum = new BigInteger("0");
//    private int AddNum = 0;
    public void BookSetAdd(String name,Bookset bookset){
        Book_Shelf.put(name,bookset);
    }
    public void BookSetDel(String name){
        Bookset temp = Book_Shelf.get(name);
        Book_Shelf.remove(name);
    }
    public double max_price(){
        this.MaxPrice = 0;
        for(String key:Book_Shelf.keySet()){
            Bookset judge_temp = Book_Shelf.get(key);
            if(judge_temp.getPrice() > MaxPrice){
                this.MaxPrice = judge_temp.getPrice();
            }
            else{
            
            }
        }
        return this.MaxPrice;
    }
    
    public BigDecimal sum_price(int num,String name,double price,int judge){
        BigDecimal a1 = BigDecimal.valueOf(num);
        BigDecimal b1 = BigDecimal.valueOf(price);
        BigDecimal result = a1.multiply(b1);// 相乘结果
    
        if(judge==3){
            this.SumPrice = this.SumPrice.add(result);
        }
        else if(judge==4){
            Bookset temp = Book_Shelf.get(name);
            a1 = BigDecimal.valueOf(temp.getNum());
            b1 = BigDecimal.valueOf(temp.getPrice());
            result = a1.multiply(b1);// 相乘结果
            this.SumPrice = this.SumPrice.subtract(result);
        }
        else{
        
        }
        return this.SumPrice;
    }
    public BigInteger sum_num(int judge,int num,String name){
        BigInteger b = new BigInteger(""+num);
        
        if(judge == 3){
            this.SumNum = this.SumNum.add(b);
            
//            this.AddNum = this.AddNum + 1;
        }
        else if(judge == 4){
            Bookset temp = Book_Shelf.get(name);
            BigInteger c = new BigInteger(""+temp.getNum());
            this.SumNum = this.SumNum.subtract(c);
//            this.AddNum = this.AddNum - 1;
        }
        else{
        
        }
        return SumNum;
    }
}
