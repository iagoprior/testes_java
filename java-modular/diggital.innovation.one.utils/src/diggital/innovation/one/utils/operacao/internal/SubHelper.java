package diggital.innovation.one.operacao.internal;

import diggital.innovation.one.operacao.Operacao;

public class SubHelper implements Operacao {

    @Override
    public int execute(int a, int b) {
        return a-b;
    }
}
