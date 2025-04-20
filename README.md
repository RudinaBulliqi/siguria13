# Autokey Cipher & Redefence Cipher
Ky projekt paraqet implementimin e Autokey dhe Redefence Cipher, dy metoda klasike për enkriptimin e tekstit. 

## Përshkrimi i algoritmeve
### Autokey Cipher
Autokey Cipher është një algoritëm klasik polialfabetik i zëvendësimit, që paraqet një përmirësim të ndjeshëm krahasuar me Vigenère Cipher. Ai përdor një çelës dinamik që fillon me një shkronjë të vetme të quajtur primer dhe vazhdon me vetë plaintext, duke shmangur kështu përsëritjen e çelësit dhe duke rritur sigurinë kundër analizës së frekuencës.
#### Mekanizmi i algoritmit
##### 1. Gjenerimi i Key Stream
* Fillon me një shkronjë të vetme (primer) e zgjedhur nga përdoruesi
* Vazhdon me plaintext-in origjinal, duke përjashtuar shkronjën e fundit
* Gjatësia e key stream-it duhet të jetë e barabartë me plaintext-in
##### 2. Enkriptimi

![Image](https://github.com/user-attachments/assets/0e03e578-dee7-45a9-a6e8-e1f5def8cade)

Ku:
* P_i = pozicioni i shkronjës në plaintext (A=0, B=1,..., Z=25)
* K_i = pozicioni i shkronjës në key stream
* C_i = pozicioni i shkronjës së enkriptuar në ciphertext

##### 3. Dekriptimi
Fillon me primer-in
Rindërton key stream-in duke përdorur plaintext-in e zbuluar

![Image](https://github.com/user-attachments/assets/a91fe3c8-af95-45dc-b5e2-6a5a6ee8b4c8)

#### Alternativa: Tabula Recta
Autokey Cipher mund të zbatohet edhe përmes një tabele të njohur si Tabula Recta, ku secili rresht është një zhvendosje e alfabetit me një pozitë më tej. Çdo karakter i plaintext-it dhe çelësit përputhet në këtë tabelë për të gjetur karakterin përfundimtar të ciphertext-it. Kjo qasje është më vizuale, por zakonisht zëvendësohet nga përdorimi i formulave për arsye efikasiteti në zbatim.

![Image](https://github.com/user-attachments/assets/bed4907f-3377-4c2e-bb25-ccb245706e22)
---
### Ekzekutimi i Autokey Cipher në Java
1. Sigurohuni që Java (JDK) është instaluar në sistemin tuaj.
2. Vendosni skedarin `AutokeyCipher.java` në një dosje të dedikuar në pajisjen tuaj.
3. Hapni terminalin (ose Command Prompt në Windows).
4. Navigoni drejt dosjes ku ndodhet skedari duke përdorur komandën:cd path/to/your/folder
5. Kompiloni programin me komandën: javac AutokeyCipher.java
6. Nëse kompilimi përfundon me sukses, ekzekutoni programin me: java AutokeyCipher
7. Shtypni tekstin që dëshironi të enkriptoni kur të kërkohet nga programi.
8. Jepni një shkronjë si çelës fillestar (primer).
9. Programi do të përpunojë tekstin dhe do të shfaqë rezultatin e enkriptuar sipas algoritmit Autokey Cipher.
---
### Shembuj të Rezultateve
![Image](https://github.com/user-attachments/assets/1d004f2b-fa24-4693-9808-90b44d21eef7)




# Redefence Cipher në Java
Ky projekt është një implementim i **Redefence Cipher**. 

**Historia e Redefence Cipher**
Redefence Cipher është një variant i shifrës së transpozimit **Railfence**, e cila është përdorur nga të dyja palët gjatë Luftës Civile Amerikane. Ajo u përshkrua për herë të parë në edicionet Shkurt–Mars dhe Qershor–Korrik të vitit 1952 të revistës *The Cryptogram* të Shoqatës Amerikane të Kriptogramit (American Cryptogram Association – ACA) nga anëtari i saj **RED E. RASER**, edhe pse emri *Redefence* u përdor për herë të parë në edicionin Korrik–Gusht të vitit 1965.

Një variant i Rail Fence Cipher me një çelës të personalizuar që përcakton rendin e leximit të linjave (rails) pasi teksti është shkruar në mënyrë zig-zag (model rail fence).

## Si Funksionon
Kjo shifër funksionon duke shkruar tekstin e thjeshtë në një model zig-zag përmes disa rreshtave ose 'shina' (rails), duke filluar nga një rresht i caktuar. Më pas, shkronjat lexohen në një rend të përcaktuar nga një fjalë kyçe ose një numër, për të prodhuar tekstin e koduar (ciphertext).

1. Teksti origjinal shkruhet në një model zig-zag mbi një numër të caktuar linjash (rails).**Railfence**
2. Në vend që linjat të lexohen nga lart-poshtë si zakonisht, një **çelës i personalizuar** përcakton rendin në të cilin lexohen linjat për të formuar tekstin e koduar.

Shembull:
- Teksti: `GRUPI13SIGURIAETEDHENAVE`
- Linjat: `3`
- Çelësi: `[2, 0, 1]`
- Teksti i koduar: `...`-rezultati pasi te behet run file Redefence.java

## Dekriptimi

Dekriptimi në Redefence Cipher është procesi i kthimit të tekstit të koduar (ciphertext) përsëri në tekstin origjinal (plaintext), duke ndjekur hapat e kundërt të enkriptimit.

## Kërkesat për dekriptim:
- Teksti i koduar (ciphertext)
- Numri i rail-ve të përdorur
- Çelësi që përcakton rendin e rail-ve

Ky proces siguron që vetëm personi që ka çelësin e saktë mund të rikuperojë tekstin e plotë origjinal.

## Files
Kodet me shembull tekstin e mesiperm
- `Redefence.java` – Kodi kryesor për enkriptim 
- `RedefenceDecrypt.java` – Kodi kryesor për dekriptim 








