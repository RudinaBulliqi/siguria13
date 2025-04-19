# Autokey Cipher & Redefence Cipher
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


The Redefence cipher is a variation of the Railfence transposition cipher which was used by both sides during the American Civil War. It was first described in the Feb-Mar and Jun-Jul 1952 editions of the American Cryptogram Association's (ACA) magazine The Cryptogram by ACA member RED E. RASER though it wasn't given the name of Redefence until the Jul-Aug 1965 edition. The cipher is formed by writing plaintext letters in a zig-zag pattern across a number of rows or 'rails' starting on any row. The text is then read off across the rows in the order determined by a keyword or number to produce the ciphertext.
