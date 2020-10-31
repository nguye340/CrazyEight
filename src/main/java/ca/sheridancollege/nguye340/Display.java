package ca.sheridancollege.nguye340;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ca.sheridancollege.nguye340.beans.CrazyEights;
import ca.sheridancollege.nguye340.beans.GameChild;
import ca.sheridancollege.nguye340.beans.GroupOfCards;

@SpringBootApplication
public class Display {
	public static boolean p1 = false;
	public static boolean p2 = false;
	public static void main(String[] args) {
		SpringApplication.run(Display.class, args);
		GameChild gc1 = new GameChild("crazyEights");

		gc1.play();
		gc1.declareWinner();

	}

	public static void myMethod() {
		try {

			GroupOfCards c = new GroupOfCards();
			c.generate();
			System.out.println(
					" _________________________________________Player 1: CARDS_____________________________________________________");
			int x = 1;
			for (CrazyEights i : c.splitArrays(c.cards)) {

				System.out.println(i + ":" + x);
				x++;
			}
			System.out.println();

			System.out.println();

			System.out.println(
					"____________________________________Player 2 :  CARDS___________________________________________________________");
			int y = 1;
			for (CrazyEights i : c.splitArrays1(c.cards)) {

				System.out.println(i + ":" + y);
				y++;
			}
			System.out.println();
			System.out.println(" available cards");
			for (CrazyEights i : c.available(c.cards)) {
				// System.out.println(i);
			}
			System.out.println("-----------------------------------");
			System.out.println("random card from available cards");
			// System.out.println(c.randomCard(c.available(c.cards)));
			// c.randomCard(c.available(c.cards));
			int index = c.randomCard(c.available(c.cards));
			System.out.println(
					"__________________________________________________________________________________________________________");
			int numberOfCard = 7;
			int numberOfCard1 = 7;
			int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0;
			int one1 = 0, two1 = 0, three1 = 0, four1 = 0, five1 = 0, six1 = 0, seven1 = 0;
			int deckInt = 1;
			int deckInt1 = 1;
			while (numberOfCard != 0 || numberOfCard1 != 0) {

				System.out.println("numberOf cards p1:  " + numberOfCard + " number of card p2:  " + numberOfCard1);
				System.out.println(
						"Player 1 : select one card from your hand enter the number corrensponding to the card");
				System.out.println("or write 0 to draw another card");
				System.out.println("remember you can draw only two cards in one inning ");
				Scanner ss = new Scanner(System.in);
				deckInt = ss.nextInt();
				if (deckInt < 0) {
					System.out.println("Please give valid input");
					continue;
				}

				if (deckInt == 0) {

					index = c.randomCard(c.available(c.cards));
					continue;
				}

				if (deckInt < 8) {
					if (deckInt != one) {

						if (deckInt != two && (deckInt != one)) {

							if (deckInt != three && (deckInt != two) && (deckInt != one)) {

								if (deckInt != four && (deckInt != three) && (deckInt != two) && (deckInt != one)) {

									if (deckInt != five && (deckInt != four) && (deckInt != three) && (deckInt != two)
											&& (deckInt != one)) {

										if (deckInt != six && (deckInt != five) && (deckInt != four)
												&& (deckInt != three) && (deckInt != two) && (deckInt != one)) {

											if (deckInt != seven && (deckInt != six) && (deckInt != five)
													&& (deckInt != four) && (deckInt != three) && (deckInt != two)
													&& (deckInt != one)) {
												{
													one = deckInt;
													two = deckInt;
													three = deckInt;
													four = deckInt;
													five = deckInt;
													six = deckInt;
													seven = deckInt;

													if (deckInt < 8) {

														System.out.println("DECK:  " + deckInt);

														System.out.println(
																Arrays.asList(c.splitArrays(c.cards)).get(deckInt - 1));
														try {
															System.out.println(Arrays.asList(c.splitArrays(c.cards))
																	.remove(deckInt));
														} catch (Exception e) {
															System.out.println("");
														}
														if ((Arrays.asList(c.available(c.cards)).get(index))
																.equals(Arrays.asList(c.splitArrays(c.cards))
																		.get(deckInt - 1))) {
															System.out.println("card is removed");

															numberOfCard--;
														} else if ((Arrays.asList(c.splitArrays1(c.cards))
																.get(deckInt1 - 1))
																		.equals(Arrays.asList(c.splitArrays(c.cards))
																				.get(deckInt - 1))) {
															System.out.println("card is removed");

															numberOfCard--;
														}

														else {
															System.out.println("not possible");

														}
													}

												}
											}
										}

									}
								}

							}
						}
					} else {
						System.out.println("you cannot use removed card again");
					}
				}

				System.out.println(
						"Player 2 : select one card from your hand enter the number corrensponding to the card");
				Scanner s1 = new Scanner(System.in);
				deckInt1 = s1.nextInt();
				if (deckInt1 < 0) {
					System.out.println("Please give valid input");
					continue;
				}

				if (deckInt1 == 0) {

					index = c.randomCard(c.available(c.cards));
					continue;
				}
				if (deckInt1 < 8) {
					if (deckInt1 != one1) {

						if (deckInt1 != two1 && (deckInt1 != one1)) {

							if (deckInt1 != three1 && (deckInt1 != two1) && (deckInt1 != one1)) {

								if (deckInt1 != four1 && (deckInt1 != three1) && (deckInt1 != two1)
										&& (deckInt1 != one1)) {

									if (deckInt1 != five1 && (deckInt1 != four1) && (deckInt1 != three1)
											&& (deckInt1 != two1) && (deckInt1 != one1)) {

										if (deckInt1 != six1 && (deckInt1 != five1) && (deckInt1 != four1)
												&& (deckInt1 != three1) && (deckInt1 != two1) && (deckInt1 != one1)) {

											if (deckInt1 != seven1 && (deckInt1 != six1) && (deckInt1 != five1)
													&& (deckInt1 != four1) && (deckInt1 != three1) && (deckInt1 != two1)
													&& (deckInt1 != one1)) {
												{
													one1 = deckInt1;
													two1 = deckInt1;
													three1 = deckInt1;
													four1 = deckInt1;
													five1 = deckInt1;
													six1 = deckInt1;
													seven1 = deckInt1;

													// int newDrawnCard=0;

													System.out.println("DECK:  " + deckInt1);

													System.out.println(
															Arrays.asList(c.splitArrays1(c.cards)).get(deckInt1 - 1));
													try {
														System.out.println(Arrays.asList(c.splitArrays1(c.cards))
																.remove(deckInt1 - 1));
													} catch (Exception e) {
														System.out.println("");
													}
													if ((Arrays.asList(c.splitArrays(c.cards)).get(deckInt - 1)).equals(
															Arrays.asList(c.splitArrays1(c.cards)).get(deckInt1 - 1))) {
														System.out.println("card is removed");

														numberOfCard1--;

													} else if ((Arrays.asList(c.splitArrays(c.cards)).get(index))
															.equals(Arrays.asList(c.splitArrays1(c.cards))
																	.get(deckInt1 - 1))) {
														System.out.println("card is removed");
														numberOfCard1--;

													} else {
														System.out.println("not possible");

													}
												}
											} // --7
										} // ------6
									} // -----5
								} // --------4
							} // ---------3

						} // ---2
					} ///// ----------1
					else {
						System.out.println("you cannot use removed card again");
					}
				}
				if (deckInt == 8 && deckInt1 == 8) {
					System.out.println(" GAME ENDED !!!!!");
					break;
				}

				// ------------------------------------------c.splitArrays(c.cards)=
				// ArrayUtils.remove(c.splitArrays(c.cards),0);
			}

			if (numberOfCard > numberOfCard1) {
				// System.out.println("player 2 is winner ");
				p2 = true;
			} else if (numberOfCard1 > numberOfCard) {
				// System.out.println("Player 1 is winner ");
				p1 = true;
			} else {
				System.out.println("ITS A TIE.........No Results||||||||||| ");
			}

		} catch (Exception e) {
			System.out.println("somethig wromg happened, run the application again ");
		}
	}

	// -----------------------------------------------------------------------------------------
	public static void myMethodfor() {

		GroupOfCards c = new GroupOfCards();
		c.generate();
		System.out.println("Splitted arrays : one set for one player");
		int a = 1;
		for (CrazyEights i : c.splitArrays(c.cards)) {

			System.out.println(i + " :" + a);
			a++;
		}
		System.out.println();

		System.out.println();

		System.out.println("Splitted arrays :  set for second player");
		int b = 1;
		for (CrazyEights i : c.splitArrays1(c.cards)) {

			System.out.println(i + ":" + b);
			b++;
		}
		System.out.println();
		System.out.println("Splitted arrays :  set for third player");
		int j = 1;

		for (CrazyEights i : c.splitArrays2(c.cards)) {

			System.out.println(i + ":" + j);
			j++;
		}

		System.out.println();

		System.out.println();
		System.out.println("Splitted arrays :  set of available cards");
		for (CrazyEights i : c.available(c.cards)) {
			// System.out.println(i);
		}
		System.out.println("random card from available cards");
		System.out.println(c.randomCard(c.available(c.cards)));

		System.out.println("CODE IS NOT IMPLEMENTED , YET ");

		System.out.println("");

	}

	public static boolean p1ID() {
		if (p1) {
			return true;
		}
		return false;
	}

	public static boolean p2ID() {
		if (p2) {
			return true;
		}
		return false;
	}

}
