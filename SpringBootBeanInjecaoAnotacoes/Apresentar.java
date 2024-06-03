package SpringBootBeanInjecaoAnotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Apresentar {
public static void apresentarContato(Object obj){
    Class contato = obj.getClass();
    for (Method a: contato.getDeclaredMethods()){
    if (a.isAnnotationPresent(Apresentar.class)){
        System.out.println(a.invoke(obj));
}
}}
}
