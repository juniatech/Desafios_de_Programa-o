print("Digite uma sequência qualquer de números: ")
Digito = input ()
MaiorDigito = 0
DigitoAtual = ''

for d in Digito:
    if (DigitoAtual == '') or (int(d) - int(DigitoAtual [-1]) == 1) or (d == '0' and DigitoAtual[-1] == '9'):
      DigitoAtual += d
    else: 
      DigitoAtual = d 
    if int(DigitoAtual) > MaiorDigito:
      MaiorDigito = int(DigitoAtual)

print("A maior sequência de digitos consecutivos encontrada é: ", MaiorDigito)
#Junia Camargo. 
