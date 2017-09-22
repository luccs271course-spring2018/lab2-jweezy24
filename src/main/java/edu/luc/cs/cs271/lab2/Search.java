package edu.luc.cs.cs271.lab2;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Search {

  /** Looks for the position of the named team in an array. */
  public static Optional<Integer> findTeamPosition(final Team[] arr, final String key) {
    // Gets the array size
    final int size = arr.length;
    // Runs through a for loop to check
    for (int i = 0; i < size; i++) {
      // Gets the current item at index and compare name to key
      if (arr[i].getName().toLowerCase().equals(key.toLowerCase())) {
        // Return the index of where the item with key is located
        return Optional.of(i);
      }
    }
    // If it does not exist in the array then return an index of -1
    return Optional.empty();
  }

  /** Looks for the position of the named team in a list. */
  public static Optional<Integer> findTeamPosition(final List<Team> list, final String key) {
    // TODO complete this method

    for (int i =0; i<list.size();i++)
    {
      if(list.get(i).getName().toLowerCase().equals(key.toLowerCase()))
      {
        return Optional.of(i);
      }
    }
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFunding(final Team[] arr, final int minFunding) {


     int high = 0;
     int pos = 0;
    for(int i =0; i< arr.length; i++)
    {
      if(arr[i].getFunding() > minFunding)
      {
          for(int p = 0; p<i; p++)
          {
              if(high < arr[p].getFunding())
              {
                  high = arr[p].getFunding();
                  pos = p;
              }
          }
          return Optional.of(pos);

      }
    }
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level. 
   * Uses binary search: Initially search the entire array, 
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFundingFast(final Team[] arr, final int minFunding) {
    // TODO complete this method
    // Gets the array size
    final int size = arr.length;
    // Initially search the entire array
    int low = 0;
    int high = size - 1;
    int mid = (low+high)/2;
    if(arr.length == 0)
    {
        System.out.println("There are no elements in the array");
        return Optional.empty();
    }
    if(arr[high].getFunding() < minFunding )
    {
        System.out.println("The funding you entered is greater than the highest funding");
        return Optional.empty();
    }
    while(true)
    {
        if(arr[mid].getFunding() < minFunding)
        {
            low = mid;
            mid = (high+low)/2;

        }
        if(arr[mid].getFunding() > minFunding)
        {
            high = mid;
            mid = (low+high)/2;
        }
        if(arr[mid].getFunding() == minFunding )
        {
            return Optional.of(mid);
        }
        if((high+low) <= 1 && arr[mid].getFunding() >= minFunding)
        {
            System.out.println((low+high)/2f);
            return Optional.of(mid);
        }

    }
    // Keep going as long as there is more than one item to be checked
    // Eliminate the wrong half of the array
    // Return current item only if it meets the condition!

  }
}
