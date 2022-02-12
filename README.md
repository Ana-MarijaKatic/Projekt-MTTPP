<h1 align="center">Automatizirano testiranje web aplikacije za online kupovinu</h1>
<p align="center">Projektni zadatak iz kolegija Metode i tehnike testiranja programske podrške</p>
<h2>About project</h3>

Ovim projektom provodi se testiranje web aplikacije za online kupovinu pomoću automatiziranih testova. Napravljeno je šest testova korisničkog sučelja aplikacije kao što su test prijave korisnika, test ažuriranja podataka korisnika, dva testa za dodavanja predmeta u košaricu na drugačije načine, test dodavanja predmeta na listu želja i test pretraživanja predmeta.

<h2>Steps required to install and run this project</h3>

<h3>Step 1</h3>
Potrebno je instalirati JAVA JDK preko <a href="https://www.oracle.com/java/technologies/downloads/">ovog</a> linka .
<h3>Step 2</h3>
Nakon instaliranja JAVA JDK potrebno je instalirati IntelliJ IDEA dostupan <a href="https://www.jetbrains.com/idea/download/#section=windows">ovdje</a>  . 
<h3>Step 3</h3>
Potrebno je preuzeti Chrome upravljački program s interneta koji će se koristiti kao pretraživač u ovom projektu. Chrome driver je <a href="https://chromedriver.chromium.org/downloads">ovdje</a> dostupan za instalaciju. NAPOMENA: Verziju upravljačkih programa odabrati u skladu s verzijom preglednika!
<h3>Step 4</h3>
Preuzmite <b>WebApplicationTesting</b> datoteku ovog repozitorija i otvorite ju unutar okruženja IntelliJ IDEA.

<h2>How to use the project</h2>
Ovaj projekt je napravljen pomoću Maven-a. Maven je alat za automatizaciju izgradnje projekata, a najčešće se koristi za Java projekte. U ovom projektu je korišten za dodavanje dodatnih biblioteka projektu. Potrebno je dodati Maven ovisnosti kao što su biblioteke <b>selenium-java, testng, maven-surefire-report-plugin, maven-compiler-plugin i maven-surefire-plugin</b>.
<br>Struktura projekta sastoji se od klasa <i>PageObject</i>, <i>Utils</i>, <i>WebForm</i> i pet testnih klasa. U klasi <i>PageObject</i> napisan je kod za inicijalizaciju WebDriver-a koristeći <i>PageFactory</i> pristup za proširenje <i>PageObject</i> modela. Klasa <i>Utils</i> sadrži varijable za osnovni URL i Chrome upravljački program, dok se u klasi <i>WebForm</i>, koja nasljeđuje klasu <i>PageObject</i>, nalaze svi lokatori i metode korištene u testovima. U klasi <i>WebForm</i> korišteni su ID i xpath lokatori zbog njihove jedinstvenosti i preciznosti, ali je na jednom primjeru korišten i lokator Link Text kako bi se pokazala i njegova primjena. Testne klase su strukturirane pomoću <i>BeforeClass</i>, <i>AfterClass</i> i <i>Test</i> anotacija iz TestNG Framework-a.
<br>Stvaranje datoteke <i>testng.xml</i> omogućuje pokretanje svih ili željenih testova odjednom te pokretanje testova iz komandne linije. Iako se testovi mogu zajedno pokrenuti pomoću <i>testng.xml</i> datoteke, oni se mogu pojedinačno pokrenuti pokrećući kod klase.

<h2>About tests</h2>
Testovi su napisani u zasebne klase kako bi ih se lakše izmjenjivalo. Jedino su testovi za dodavanje predmeta u košaricu napisani u jednoj klasi jer testiraju istu funkcionalnost na različite načine. Više o testovima nalazi se u datoteci <b>Testing Report</b> koja sadrži dokument s izvještaje o svih testova.

<h2>About me</h2>
Studentica diplomskog studija Fakulteta elektrotehnike, računarstva i informacijskih tehnologija Osijek u Osijeku.
