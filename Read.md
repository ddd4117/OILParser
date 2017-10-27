OILParser 
======================
# 시작전에 OILParser에 선언 
<pre><code>
	/** currentObject는 현재 파싱되어지는 Object 객체이다 **/
	private OilObject currentObject;
	
	/** _Name : 현재 오브젝트의 이름 또는 정보를 저장하는 변수 **/
	public String _Name = "";
	
	/** attr_list ; Object의 속성중에서 list단위로 관리할 경우 사용되어지는 변수 **/
	public Queue attr_list = new LinkedList();
	
	/** flag : 속성이 list인지 아니지 판단하는 변수 **/
	static boolean flag = false;
	
	/** OilParserControl ctl : OilParserControl 은 Object를 생성하거나 속성을 추가하는 클래스 **/
	 private OilParserControl ctl = new OilParserControl();
	
	private OilSpec oil = new OilSpec();
</code></pre>
======================

# addAttribute(String name, String value) vs addAttribute(String list_name, String list_value, String name, String value)
<pre><code>
//test.oil code
	OS config {
		STATUS = STANDARD;
		ERRORHOOK = TRUE;
		SHUTDOWNHOOK = TRUE;
		PRETASKHOOK = TRUE;
		POSTTASKHOOK = TRUE;
		BUILD = TRUE {
			APP_SRC = "./..";
			CFLAGS = "-g";
			CFLAGS = "-Wall -pedantic -Wformat -std=c99 -D_XOPEN_SOURCE=600";
			CFLAGS = "-Wmissing-field-initializers";
			CFLAGS = "-DWITH_DEBUG -fprofile-arcs -ftest-coverage";
			ASFLAGS = "";
			LDFLAGS = "-g -lpthread -fprofile-arcs -ftest-coverage";
			COMPILER = "gcc";
			LINKER = "gcc";
			ASSEMBLER = "as";
		};
	};
</code></pre>
	위의 코드에서 STATUS, ERRORHOOK같은 부분들은 바로 추가할 수 있다.
	하지만 
	BUILD = TRUE{
		...
	} 
	부분은 한번에 추가해 줄 수 없어 queue에 attribute_list를 추가후 Build문이 끝나면 한번에 저장을 한다.
		addAttribute_list(Queue attr_list, OilObject currentObject);
	
	그리고 필요한게 위에 선언한 flag인데, flag는 attribute_list로 갈 경우 flag = true로, 끝나면 flase로 설정해줘야한다.	
<pre><code>
case 2: /** NAME  { parameter_liost } **/
				flag = true;
				enterOuterAlt(_localctx, 2); {
				setState(439);
				try {
					String value = this.getCurrentToken().getText();
					attr_list.offer(_Name);
					attr_list.offer(value);
					currentObject.addAttribute(_Name, value);
				} catch (NumberFormatException  | InvalidOilException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				match(NAME);
				setState(440);
				match(T__4);
				setState(441);
				parameter_list(0);
				setState(442);
				match(T__5);
				ctl.addAttribute_list(attr_list, currentObject);
				flag = false;
			}
				break;
</code></pre>
# OilParserControl에 대한 설명
	대부분 OilParser에서 선언한 변수를 넣어주기만 하면된다.
	
	OilParser에서 현재 토큰의 스트링을 가져오는 방법은

	"this.getCurrentToken().getText()"을 하면된다.
	
	아래의 temp는 대부분 temp = this.getCurrentToken().getText()이다.
	
## 1. public void finalizeOilObjCreation(OilObject currentObject, OilSpec oil)
	ex) ctl.finalizeOilObjCreation(currentObject, oil);
	
## 2. public OilObject makeObject(String Name)
	currentObject = ctl.makeObject(temp);


## 3. public void addAttribute_list(Queue attr_list, OilObject currentObject)	
	ctl.addAttribute_list(attr_list, currentObject);

## 4. public OilSpec getOilSpec(OilSpec oil)
## 5. public void setID(OilSpec oil)
## 6. private void putIdsOn(List<OilObject> objs)
## 7. private void putIdsOnResources(List<OilResource> objs)


### ● 순서없는 목록(글머리 기호)
```
* 빨강
  * 녹색
    * 파랑

+ 빨강
  + 녹색
    + 파랑

- 빨강
- 녹색
- 파랑
```
* 빨강
  * 녹색
    * 파랑

+ 빨강
  + 녹색
    + 파랑

- 빨강
  - 녹색
    - 파랑

혼합해서 사용하는 것도 가능하다(내가 선호하는 방식)
* 1단계
	- 2단계
    	+ 3단계
			= 4단계

## 2.4. 코드```<pre><code></code></pre>```
4개의 공백 또는 하나의 탭으로 들여쓰기를 만나면 변환되기 시작하여 들여쓰지 않은 행을 만날때까지 변환이 계속된다.
```
This is a normal paragraph:

    This is a code block.
end code block.
```
실제로 적용해보면,
This is a normal paragraph:

    This is a code block.
end code block.

## 2.5. 수평선```<hr/>```
아래 줄은 모두 수평선을 만든다. 마크다운 문서를 미리보기로 출력할 때 *페이지 나누기* 용도로 많이 사용한다.
```
* * *

***

*****

- - -

---------------------------------------
```


## 2.6. 링크
* 참조링크

```
[link keyword][id]
[id]: URL "Optional Title here"

Link: [Google][googlelink]
[googlelink]: https://google.com "Go google"
```

Link: [Google][googlelink]
[googlelink]: https://google.com "Go google"

* 인라인 링크
```
syntax: [Title](link)
```
Link: [Google](https://google.com, "google link")

* 자동연결
```
<http://example.com/>
<address@example.com>
```

<http://example.com/>
<address@example.com>

## 2.7. 강조
```
*single asterisks*
_single underscores_
**double asterisks**
__double underscores__
++underline++
~~cancelline~~
```
*single asterisks*
_single underscores_
**double asterisks**
__double underscores__
++underline++
~~cancelline~~

