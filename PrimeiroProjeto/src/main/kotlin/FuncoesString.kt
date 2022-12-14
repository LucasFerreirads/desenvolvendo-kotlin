fun main()
{
    val str = "Programação Kotlin"
    println("O tamanho da string: ${str.length}")                            //para saber o tamanho
    println("Posição 0 da string: ${str[0]}")       //Posição da String
    println(str.startsWith("Pro"))                   //Se começa com "Pro"
    println(str.endsWith("adc"))                     //Se termina com abc

    println(str.substring(2, 4))                  //Pega a posição 3 até a 4
    println(str.replace("Kotlin", "Kotlin é show")) //Troca Kotlin por Kotlin é show
    println(str.lowercase())                        //passa todos os caracteres para minúsculo
    println(str.uppercase())                        //Passa os valores para maiúsculo

    println(str.trim())                             //Remove espaços desnecessários

}