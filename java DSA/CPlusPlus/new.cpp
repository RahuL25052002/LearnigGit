#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Chai {
public:
    string teaName;
    int servings;
    vector<string> ingredients;

    void displayDetails() {
        cout << "teaName: " << teaName << endl; // Corrected from ingredients to teaName
        cout << "servings: " << servings << endl;
        cout << "ingredients: ";

        for (const string& ingredient : ingredients) { // Using reference for efficiency
            cout << ingredient << " ";
        }
        cout << endl; // Add newline for better readability
    }
};

int main() {
    Chai chaiOne;
    chaiOne.teaName = "lemon tea"; // Changed from `String` to `std::string`
    chaiOne.servings = 2;
    chaiOne.ingredients = {"water", "lemon", "sugar", "cup", "teaPowder"};

    chaiOne.displayDetails();

    return 0;
}

