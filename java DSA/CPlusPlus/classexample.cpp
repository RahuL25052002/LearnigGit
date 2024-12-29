#include<iostream>

#include<vector>


using namespace std;

class Chai{
	public:
		string teaName;
		int servings;
		vector<string> ingredients;

		void displayDetails(){
			cout<<	"teaName: "	<<teaName	<<endl;
			cout<<	"servings: "	<<servings	<<endl;
			cout<<	"ingredients: "	<<endl;

			for(string ingredient:ingredients){
				cout<<	ingredient	<<	" ";
			}
		}
};


int main(){
	Chai chaiOne;
	chaiOne.teaName="lemon tea";
	chaiOne.servings=2;
	chaiOne.ingredients={"water","lemon","sugar","cup","teaPowder"};

	chaiOne.displayDetails();

	return 0;
}
