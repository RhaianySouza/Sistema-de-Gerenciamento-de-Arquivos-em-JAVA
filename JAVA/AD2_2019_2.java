package ad2_2019_2;

public class AD2_2019_2 {
    public static void main(String[] args) {
        Pasta p1 = new Pasta("dir1");
        p1.adiciona(new Arquivo("arquivo1.txt", 150));
        p1.adiciona(new Arquivo("arquivo2.txt", 200));
        Pasta p2 = new Pasta("dir2");
        p2.adiciona(new Arquivo("arquivo3.txt", 500));
        Pasta p3 = new Pasta("dir3");
        p3.adiciona(new Arquivo("arquivo4.txt", 350));
        p3.adiciona(p2);
        Pasta raiz = new Pasta("c:/");
        raiz.adiciona(p1);
        raiz.adiciona(p3);
        raiz.remove("dir1/arquivo1.txt");
        System.out.println(raiz.getTamanho());
        System.out.println(raiz);
    } 
}
class Pasta{
    String diretorio;
    Arquivo list[]=new Arquivo[10];
    
    public Pasta(String a){
        diretorio=a;
    }
    public int getTamanho(){
        int s=0;
        for(int f=0;f<list.length;f++){
            if(list[f]!=null){
                s+=list[f].len;
            }
        }return s;
    }
    public void adiciona(Arquivo a){
        for(int l=0;l<list.length;l++){
            if(list[l]==null){
                list[l]=new Arquivo(a.file,a.len);
                break;
            } 
        }
    }
    public void adiciona(Pasta a){
        int s=0;
        for(int l=0;l<list.length;l++){
            if(list[l]==null){
                list[l]=new Arquivo(a,a.getTamanho());
                break;
                }
            }
        }
    public void remove(String texto){
        String s;
        for(int l=0;l<list.length;l++){
            if(list[l]!=null){
                if(list[l].file!=null){list[l]=null;break;}//checa arquivo
                else{
                    if((list[l].path.diretorio)==texto){list[l]=null;}//Checa pasta
                    if((list[l].path.diretorio)==texto.split("/")[0]){
                        list[l].path.remove(texto.split("/")[1]);//entra no nivel mais interno diretorio
                        break;
                    }
                }
            }
        }
    }
    public String caminho(){
        String s="";
        for(int l=0;l<list.length;l++){
            
        }
        return s;
    }
    @Override
    public String toString(){
        String s=diretorio+"\n";
        for(int l=0;l<list.length;l++){
            if(list[l]!=null){
               if(list[l].file!=null){s+="\t"+list[l].toString();}
               else{s+="\t"+list[l].path.toString().replace("\n", "\n\t");}
               s+="\n";
            }
        }return s;
    }
}

class Arquivo{
    String file;
    Pasta path;
    int len;
    
    public Arquivo(String f, int t){
        file = f;         
        len = t; 
    }
    public Arquivo(Pasta p,int t){
        path= p;       
        len = t;
    }
    public String toString(){
        return file;
    }
}


