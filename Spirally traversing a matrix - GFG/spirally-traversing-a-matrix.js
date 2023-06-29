//{ Driver Code Starts
//Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function main() {
    let t = parseInt(readLine());
    for(let i=0;i<t;i++)
    {
        let input_line = readLine().split(' ');
        let n = parseInt(input_line[0]);
        let m = parseInt(input_line[1]);
        
        input_line = readLine().split(' ');
        let matrix = new Array(n);
        for(let i=0;i<n;i++)
        {
            let a = new Array(m);
            for(let j=0;j<m;j++)
            {
                a[j] =parseInt(input_line[i*m+j]);
            }
            matrix[i] = a;
        }
        
        let obj = new Solution();
        let ans = obj.spirallyTraverse(matrix, n, m);
        let s = "";
        for(let i = 0 ; i < ans.length ;i++)
        {
            s+=ans[i];
            s+=" ";   
        }
        console.log(s);
    }
}

// } Driver Code Ends


//User function Template for javascript


/**
 * @param {number[][]} matrix
 * @param {number} r
 * @param {number} c
 * @returns {number[]}
*/
class Solution 
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    spirallyTraverse(matrix, r, c)
    {
        // code here
        var resultArr = [];
        function print(arr, i, j, m, n) {
 
            // If i or j lies outside the matrix
            if (i >= m || j >= n) return;
         
            // Print First Row
            for (let p = j; p < n; p++) {
                resultArr.push(arr[i][p]);
            }
         
            // Print Last Column
            for (let p = i + 1; p < m; p++) {
                resultArr.push(arr[p][n - 1]);
            }
         
            // Print Last Row, if Last and
            // First Row are not same
            if ((m - 1) != i) {
                for (let p = n - 2; p >= j; p--) {
                    resultArr.push(arr[m - 1][p]);
                }
            }
         
            // Print First Column, if Last and
            // First Column are not same   
            if ((n - 1) != j) {
                for (let p = m - 2; p > i; p--) {
                    resultArr.push(arr[p][j] + '');
                }
            }
            print(arr, i + 1, j + 1, m - 1, n - 1);
        }
        
        print(matrix, 0, 0, r, c);
        return resultArr;
    }
}