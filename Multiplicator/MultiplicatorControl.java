
package merge_mvc;


public class MultiplicatorControl {
	//접근선언
	MultiplicatorModel model;
	MultiplicatorView view;
	
	//model과 view정보 불러오기
	public void ctrlStart () {
		model = new MultiplicatorModel();
		view = new MultiplicatorView();
	}
	
	
	// 앱실행 메서드
	public void appStart () {
		
		while(true) {
			
			view.StartView(); //main화면출력
			
			//메인에서 1 입력시 계산실행
			if(view.getAction()==1) {
				
				//view의 입력 -> model에 저장
				model.setNum1(view.num1());
				model.setOp(view.op());
				model.setNum2(view.num2());
				
				// syso(num1 + num2 = res); 과 같다
				view.print(model.getNum1()+model.getOp()+model.getNum2()
				+"="+model.result(model.getOp()));
			
			//메인에서 2 입력시 종료
			}else if(view.getAction()==2) {
			
				//종료문구 출력
				view.endPrint();
				break;
				
			}
		}

	}
}