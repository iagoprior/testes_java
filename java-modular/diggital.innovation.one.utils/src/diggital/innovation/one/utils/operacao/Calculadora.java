package diggital.innovation.one.operacao;

import diggital.innovation.one.operacao.internal.DivHelper;
import diggital.innovation.one.operacao.internal.MultHelper;
import diggital.innovation.one.operacao.internal.SubHelper;
import diggital.innovation.one.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;
    private MultHelper multHelper;

    public Calculadora(){
        multHelper = new MultHelper();
        divHelper = new DivHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
    }
    public int sum(int a, int b){
        return sumHelper.execute(a,b);

    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }


    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
}
