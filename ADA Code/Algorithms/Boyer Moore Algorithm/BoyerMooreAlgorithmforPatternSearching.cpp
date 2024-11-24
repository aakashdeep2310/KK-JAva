#include <iostream>
#include <vector>
#include <string>
using namespace std;

void badCharHeuristic(string pattern, int size, vector<int> &badChar){
    for(int i = 0; i< 256; i++){
        badChar[i] = -1;
    }

    for(int i = 0; i< size; i++){
        badChar[(int)pattern[i]] = i;
    }

}

// Boyer-Moore pattern searching function
void boyerMooreSearch(string text, string pattern){
    int m = pattern.length();
    int n = text.length();

    vector<int> badChar(256);
    badCharHeuristic(pattern, m, badChar);

    int shift = 0;

    while(shift <= (n-m)){
        int j = m-1;

        while(j>=0 && pattern[j] == text[shift+j]){
            j--;
        }

        if(j<0){
            cout<<"Pattern found at index "<< shift << endl;
            shift += (shift + m < n) ? m-badChar[text[shift+m]] : 1;
        }else{
            shift += max(1, j - badChar[text[shift+j]]);
        }
    }
}


int main(){
    string text = "ABAAABCDABCD";
    string pattern = "ABCD";

    cout<< "Text : " << text << endl;
    cout<< "Pattern: "<< pattern << endl;

    boyerMooreSearch(text, pattern);

    return 0;
 }