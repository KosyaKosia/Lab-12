/**
 * Lab12
 * #TeamNameNotFound
 * Create Aristova Diana and Kosykova Daria
 *
 * 1A - Print the column numbers,
 * all elements of which are even.
 * For each column with a negative element
 * on the main diagonal print its number and the
 * sum of all elements of this column.
 *
 * 2A - Among the rows of the given matrix,
 * containing only odd elements,
 * find the row with the maximum sum of the modules of elements
 *
 * 9B -  Get a new matrix by adding to the elements of each column
 * of the first matrix the product of the elements of the corresponding
 * rows of the second matrix.
 *
 * 12B - A characteristic of an integer matrix column
 * is the sum of the modules of its negative odd elements.
 * Rearranging the columns of a given matrix,
 * arrange them in accordance with the growth characteristics
 *
 */

package by.bntu.fitr.tnnf.javalabs.lab12;

public class Main {
    public static void main(String[] args) {

        int row = UsersInput.inputInt("Input count row: ");
        int col = UsersInput.inputInt("Input count col: ");
        char answerAboutFill;
        View.print("You fill array?(all elem odd)(y/n)\n");
        answerAboutFill = UsersInput.inputChar("Input answer: ");

        float[][] array = new float[row][col];
        if(answerAboutFill == 'y')
        {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    array[i][j] = UsersInput.inputFloat("");
                }
            }
        }
        else {
            int min = UsersInput.inputInt("Input min in you range: ");
            int max = UsersInput.inputInt("Input max in you range: ");
            Logic.initArrayFloat(array, min, max, row, col);
            for(int i = 0; i < row; i++)
            {
                for(int j = 0; j < col; j++)
                {
                    View.print(array[i][j] + "\t");
                }
                View.print("\n");
            }
        }


        View.print("It's program do individual tasks: \n 1 - 1A \n 2 - 2A \n " +
                "3 - 12B\n 4 - 9B B\n" +
                " What tasks you wont solve?");

        int answer = UsersInput.inputInt("Input your answer(1,2,3 or 4): ");
        switch (answer)
        {
            case 1: {
                View.print("Count col: " + Logic.numStolb(array, row, col));
                View.print("Number col: " + Logic.numStMainDiagol(array, row, col));
                break;
            }
            case 2: {
                View.print("Row with max summary: " + Logic.sumOddElem(array, row, col));
                break;
            }
            case 3:
            {
                View.print("New array sort by character:\n");
                Logic.newSortedArray(array, row, col);
                for(int i = 0; i < row; i++)
                {
                    for(int j = 0; j < col; j++)
                    {
                        View.print(array[i][j] + "\t");
                    }
                    View.print("\n");
                }
                break;
            }
            case 4: {
                float[][] secondArr = new float[row][col];
                float[][] newArr;
                int min = UsersInput.inputInt("Input min in yor range: ");
                int max = UsersInput.inputInt("Input max in yor range: ");

                View.print("Second array:\n");
                Logic.initArrayFloat(secondArr,min,max, row, col );
                for(int i = 0; i < row; i++)
                {
                    for(int j = 0; j < col; j++)
                    {
                        View.print(secondArr[i][j] + "\t");
                    }
                    View.print("\n");
                }

                newArr = Logic.createNewArray(array, secondArr, row);


                View.print("\nNew Array: ");
                for(int i = 0; i < row; i++)
                {
                    for(int j = 0; j < row; j++)
                    {
                        View.print(newArr[i][j] + "\t");
                    }
                    View.print("\n");
                }
                break;
            }
        }

    }
}
