# Book_webshop - mobilalkfejl_gyak_projekt
**APK**
* https://drive.google.com/file/d/1Q_JLMXXRGMgSYsMe8w9vIMNRAw1ZhHIw/view?usp=sharing (ha valamiért Coospace nem engedné)


Az app 99%-ban úgy készült, ahogy az a gyakorlati videókban bemutatásra került. Nem hiánytalan (ahogy az ott bemutatott app sem), de igyekeztem arra törekedni, hogy a pontozási kritériumok többségének megfeleljen és közben nézzen is ki valahogy.

## Pár megjegyzés az apk teszteléséhez (több eszközön próbálva változó eredményeket kaptam): 
* Google Play protect legyen kikapcsolva telepítés előtt (ha még úgy sem engedné telepíteni, pls buildeld le source kódból)
* Telefon beállításokban a megjelenítésnél a betűméret legyen normál, ha nagyobb, szétcsúszik picit a megjelenítés
* 3 eszközből próbálva 1-nél nem engedte a Google beléptetést, a másik kettőn igen, elvileg működnie kéne, implementálva van ¯\\_(ツ)_/¯

## Pontozási segédlet (csak legalább a min 20 pont legyen meg please)

- [x] Fordítási hiba nincs 
     - **1/1 PONT**

- [x] Futtatási hiba nincs 
     - **1/1 PONT**

- [x] Firebase autentikáció meg van valósítva: (Regisztráció és autentikált bejelentkezés is van)
     - Be lehet jelentkezni és regisztrálni
     - **4/4 PONT**

- [x] Adatmodell definiálása (class vagy interfész formájában) 
     - **2/2 PONT**

- [x] Legalább 3 különböző activity vagy fragmens használata 
     - **2/2 PONT**

- [x] Beviteli mezők beviteli típusa megfelelő (jelszó kicsillagozva, email-nél megfelelő billentyűzet jelenik meg stb.) 
     - **3/3 PONT**

- [x] ConstraintLayout és még egy másik layout típus használata
     - **1/1 PONT**

- [x] "Reszponzív: 
     - különböző kijelző méreteken is jól jelennek meg a GUI elemek (akár tableten is) (a könyvek képméretein kívül elvileg minden oké)
     - elforgatás esetén is igényes marad a layout (ahol kellett megvalósítottam a land nézetet is, a többi résznél elvileg minden oké)
     - **3/3 PONT**

- [ ] Legalább 2 különböző animáció használata (csak egy van belerakva ¯\\_(ツ)_/¯ )
     - **0/2 PONT**

- [x] Intentek használata: navigáció meg van valósítva az activityk/fragmensek között (minden activity/fragmens elérhető)
     - **2/2 PONT**

- [x] Legalább egy Lifecycle Hook használata a teljes projektben: (onPause-ban van esetleg extra az onCreate-en kívül)
      - onCreate nem számít
      - az alkalmazás funkcionalitásába értelmes módon beágyazott, azaz pl. nem csak egy logolás
     - **idk/2 PONT**

- [ ] Legalább egy olyan androidos erőforrás használata, amihez kell android permission (nincs)
     - **0/1 PONT**

- [x] Legalább egy notification vagy alarm manager vagy job scheduler használata (van több is)
     - **2/2 PONT**

- [x] CRUD műveletek mindegyike megvalósult és az adatbázis műveletek a konvenciónak megfelelően külön szálon történnek (teljes CRUD, de nem külön szálon)
     - **4/5 PONT**

- [x] Legalább 2 komplex Firestore lekérdezés megvalósítása (elvileg egy van)
     - **idk/4 PONT**

- [x] Szubjektív pontozás a projekt egészére vonatkozólag: (próbáltam törekedni rá, hogy nézzen is ki valahogy és ne legyen összecsapott, de nem tökéletes)
      - ez 5-ről indul és le lehet vonni, ha igénytelen, összecsapott, látszik hogy nem foglalkozott vele, kísértetiesen hasonlít a videóban létrehozotthoz stb.
     - **idk/5 PONT**
