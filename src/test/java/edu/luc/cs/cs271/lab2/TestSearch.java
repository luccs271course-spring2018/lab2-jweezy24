package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

   List<Team> makeListFixture(final int size) {
    final List<Team> tempList = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      tempList.add( new Team("Team " + s, "Coach " + s, i * 100 + 50));
    }
    return tempList;
  }

  // TODO makeListFixture

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f

  @Test
  public void testFindPositionList0() {
    final List<Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10s() {
    final List<Team> list = makeListFixture(10);
    assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10f() {
    final List<Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
  }
  
  // TODO: testFindMinFundingArray for several sizes and scenarios

  @Test
  public void testMinFundingArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertEquals(Search.findTeamMinFunding(arr, 1000),Optional.empty());
  }

  @Test
  public void testMinFundingArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertEquals(Search.findTeamMinFunding(arr, 500), Optional.of(5));
  }

  @Test
  public void testMinFundingArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertEquals(Search.findTeamMinFunding(arr, 2000),Optional.empty());
  }


  // TODO: testFindMinFundingArrayFast for several sizes and scenarios


  @Test
  public void testMinFundingArrayFast0() {
    final Team[] arr = makeArrayFixture(0);
    assertEquals(Search.findTeamMinFundingFast(arr, 1000),Optional.empty());
  }

  @Test
  public void testMinFundingArrayFast10s() {
    final Team[] arr = makeArrayFixture(10);
    assertEquals(Search.findTeamMinFundingFast(arr, 500), Optional.of(5));
  }

  @Test
  public void testMinFundingArrayFast10f() {
    final Team[] arr = makeArrayFixture(10);
    assertEquals(Search.findTeamMinFundingFast(arr, 2000),Optional.empty());
  }


}
