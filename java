<!DOCTYPE html>
<html lang="ru">
<head>
	<meta charset="UTF-8">
	<title>Coding Challenge</title>
</head>
<body>
	<script>

		let johnBills ={
			name: "John",
			bills: [124, 48, 268, 180, 42],
			tips: [], 
			finalAmount: [],
			averageTip: 0,
			calculateTip: function(){
				tipCalculator(this.bills, this.tips, this.name);
				
			},
			calculateAmount: function(){
				for(i in this.bills)
					this.finalAmount.push(this.bills[i] + this.tips[i]);
					
			},
			
			calculateAvTip: function(){
				let count = 0;
				for(let i = 0; i<this.tips.length; i++){
					this.averageTip +=this.tips[i];
					count++;
				
				}	
				this.averageTip   /= count;	
				
			}
		

		} ;
		let markBills ={
			name: "Mark",
			bills: [77, 375, 110, 45],
			tips: [], 
			finalAmount: [],
			averageTip: 0,
			calculateTip: function(){
				tipCalculator(this.bills, this.tips, this.name);
				
			},
			calculateAmount: function(){
				for(i in this.bills)
					this.finalAmount.push(this.bills[i] + this.tips[i]);
			},
			calculateAvTip: function(){
				let count = 0;
				for(let i = 0; i<this.tips.length; i++){
					this.averageTip +=this.tips[i];
					count++;
				
				}	
				this.averageTip   /= count;	
				
			}

				
			

		} ;



		

		function tipCalculator (bill, tip, name ){
			//let tip;
			for(let i =0;i<bill.length; i++){
				if(name==="John"){
					if(bill[i] <=50)
						tip[i] = bill[i] *0.2;
					if(bill[i] >=50 && bill[i] <200)	
						tip[i] = bill[i]*0.15;
					if(bill[i] >= 200)	
						tip[i] = bill[i]*0.1;	
				}
				if(name==="Mark"){
					if(bill[i] <=100)
						tip[i] = bill[i] *0.2;
					if(bill[i] >=100 && bill[i] <300)	
						tip[i] = bill[i]*0.15;
					if(bill[i] >= 300)	
						tip[i] = bill[i]*0.1;	
				}
				
			}
			
		
		}

		function calculateAvTip(tip){
			let count=0;
				for(i in tip)	{
					averageTip +=tip[i];
					count++;
				}	
				taverageTip  /= count;	
		}

		
		johnBills.calculateTip();
		johnBills.calculateAmount();
		johnBills.calculateAvTip();

		markBills.calculateTip();
		markBills.calculateAmount();
		markBills.calculateAvTip();

		console.log(johnBills.tips.join(" "));
		console.log(johnBills.finalAmount.join(" "));
		function show(person){
			
			console.log("Average tip of " + person.name + "\s family " + person.averageTip);

		}
		console.log(markBills.tips.join(" "));
		console.log(markBills.finalAmount.join(" "));


		show(johnBills);
		show(markBills);
		johnBills>markBills? 
			console.log("John paid more tips" ):
			console.log("Mark paid more tips" );
	</script>
</body>
</html>
