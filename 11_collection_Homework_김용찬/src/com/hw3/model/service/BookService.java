package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	// 필드
	private Scanner sc = new Scanner(System.in);
	
	// 도서를 저장할 목록 List
	private List<Book> library = new ArrayList<Book>();
	// 부모타입 참조변수 = 자식객체의 주소 (다형성 중 업캐스팅)
	
	// 즐겨찾기 도서를 저장할 목록 List
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() {
		
		// BookService 객체가 생성될 때 library List에 5개 도서 등록
		library.add(new Book("세이노의 가르침",6480,"세이노","데이원",1111));
		library.add(new Book("문과남자의 과학공부",15750,"유시민","돌베개",2222));
		library.add(new Book("역행자",17550,"자청","웅진지식하우스",3333));
		library.add(new Book("꿀벌의 예언",15120,"베르나르 베르베르","열린책들",4444));
		library.add(new Book("도둑맞은 집중력",16920,"요한 하리","어크로스",5555));

	}
	
	
	// 메서드
	public void displayMenu() {
		
		try {
			
			int menuNum = 0;
			
			do {
				System.out.println("===도서 목록 프로그램====");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가 ");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("9. 프로그램 종료");
				
				System.out.println("메뉴를 입력하세요 : ");
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : addBook(); break;
//				case 2 : showBookList(library); break;
//				case 3 : editBook(); break;
//				case 4 : deleteBook(); break;
//				case 5 : addFavorite(); break;
//				case 6 : deleteFavorite(); break;
//				case 7 : showBookList(favList); break;
//				case 8 : randomBook(); break;
				case 0 : System.out.println("종료되었습니다."); break;
				default : System.out.println("메뉴에 있는 번호만 입력하세요!"); break;
				}
			}while(menuNum != 0);
			
			
			
			
			
		} catch (Exception e) {
			// Exception : 예외 클래스의 최상위 클래스
			System.out.println("예외 발생");
			e.printStackTrace(); // 예외추적
		}
	}

	/** 도서 등록 메서드
	 * 
	 */
	public void addBook() {
		
		System.out.println("========도서 등록========");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String writer = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		Book newBook = new Book(title,price,writer,publisher,bookNum);
		
		library.add(newBook);
		
		System.out.println("등록 완료");
	
		
		
	}


















}
