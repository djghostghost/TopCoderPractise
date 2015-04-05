package AB;

import com.sun.deploy.util.StringUtils;

/**
 * Created by liguoxiang on 4/5/15.
 */
public class AB {
    private String createString(int N,int K){

        int maxString=0;
        //作られるパアスによる、作られるかを判断する
        if (N%2==0){
            maxString=N/2*N/2;

        }else{
            maxString=((N-1)/2)*((N+1)/2);
        }
        //impossible
        if(maxString<K){
            return "";
        }

        //impossible but K=0
        //can return "AAAAAAAA" or "BBBBB"
        //or "BBBBAAAA"
        //whatever you like
        if(K==0){
            return repeat("A",N);
        }

        for(int i=0;i<N;i++){
            int countA=i+1;
            int countB=N-countA;
            int diff=countA*countB-K;

            if(diff>0){
                countB=(int)(K/countA);
                //if countBinA==2
                //the part before B become AABAA.....BBBBB
                int countBinA=K%countA;
                int remiderLength=N-countA-countB-1;
                
                return repeat("A",countBinA)+
                        repeat("B",1)+
                        repeat("A",countA-countBinA)+
                        repeat("B",countB)+
                        //残りの部分でAで埋める
                        repeat("A",remiderLength);

            }else if(diff==0){
                return repeat("A",countA)+repeat("B",countB);
            }

        }

        return "";
    }

    private static String repeat(String str,int times){
        return new String(new char[times]).replace("\0",str);
    }

}
