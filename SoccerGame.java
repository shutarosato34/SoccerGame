package development;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SoccerGame {

	public static void main(String[] args) throws IOException {
		/*試合開始*/
		System.out.println("⚽PK GAME⚽");
		consoleStop();

		System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		System.out.println("||              　　　　　　||");
		System.out.println("||      　　　●      　　　||");
		System.out.println("||    　　　ー■ー    　　　||");
		System.out.println("||      　　　■      　　　||");
		System.out.println("||     　　　 ハ     　　　 ||");

		/*Random order = new Random();
		int order1 = order.nextInt(10);*/
		int order1 = 8;
		if (order1 > 5) {
			senkou();
		} else {
			koukou();
		}
	}

	static void senkou() {
		System.out.println("名前を入力してください");
		Scanner name1 = new Scanner(System.in);
		String name = name1.next();
		int PlayerPoint = 0;
		int ComputerPoint = 0;
		int i = 0;
		String[] Player = new String[100];
		String[] Computer = new String[100];
		Player[0] = name;
		Computer[0] = "Computer";
		consoleStop();
		System.out.println(name + "は先攻です");
		while (true) {
			i += 1;
			consoleStop();
			System.out.println("---------------------------");
			if (i > 1) {
				System.out.println("攻守交替！");
			}
			System.out.println("どこにシュートしますか？");
			System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　１　｜　２　｜　３　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("　　　　　　⚽　　　　　　");
			System.out.println(Arrays.toString(Player)
					.replace("[", "").replace("null", " ").replace(",", "").replace("]", ""));
			System.out.println(Arrays.toString(Computer)
					.replace("[", "").replace("null", " ").replace(",", "").replace("]", ""));
			System.out.println("---------------------------");
			/*蹴る場所を決める*/
			int KickZone;
			while (true) {
				Scanner scanner = new Scanner(System.in);
				KickZone = scanner.nextInt();

				if (KickZone == 1 || KickZone == 2 || KickZone == 3) {
					break;
				} else {
					System.out.println("1～3の値を半角で入力してください");
				}
			}

			/*コンピューターがどこに飛ぶか決める*/
			Random kerubasyo = new Random();
			int SaveZone = kerubasyo.nextInt(3);
			SaveZone += 1;

			Random random = new Random();
			int random1 = random.nextInt(100);
			consoleStop();
			if (SaveZone == KickZone) {
				if (random1 > 50) {
					System.out.println("GOOOOOOOOOOOOL!!!");
					PlayerPoint += 1;
					Player[i] = "〇";
				} else if (random1 > 10 && random1 < 51) {
					System.out.println("キーパーに弾かれた！");
					Player[i] = "×";
				} else if (random1 > 7 && random1 < 11) {
					System.out.println("ポストに弾かれた！");
					Player[i] = "×";
				} else if (random1 > 4 && random1 < 8) {
					System.out.println("ボールは大きく枠を外れた！");
					Player[i] = "×";
				} else if (random1 == 0) {
					System.out.println("ノイアーが突然現れて、シュートを止めた！");
					Player[i] = "×";
				} else if (random1 == 1) {
					System.out.println("サンプラザ中野くんが突然現れてRunnerを歌い始めた！");
					Player[i] = "×";
				} else if (random1 == 2) {
					System.out.println("ワクワクさんが突然現れてDIYを始めた！");
					Player[i] = "×";
				} else if (random1 == 3) {
					System.out.println("カピバラさんが突然現れて温泉の勧誘を始めた！");
					Player[i] = "×";
				} else if (random1 == 4) {
					System.out.println("布施明さんが突然現れてシクラメンのかほりを歌い始めた！");
					Player[i] = "×";
				}
			} else {
				if (random1 > 10) {
					System.out.println("GOOOOOOOOOOOOL");
					PlayerPoint += 1;
					Player[i] = "〇";
				} else if (random1 > 7 && random1 < 11) {
					System.out.println("ポストに弾かれた！");
					Player[i] = "×";
				} else if (random1 > 4 && random1 < 8) {
					System.out.println("ボールは大きく枠を外れた！");
					Player[i] = "×";
				} else if (random1 == 0) {
					System.out.println("ノイアーが突然現れて、シュートを止めた！");
					Player[i] = "×";
				} else if (random1 == 1) {
					System.out.println("サンプラザ中野くんが突然現れてRunnerを歌い始めた！");
					Player[i] = "×";
				} else if (random1 == 2) {
					System.out.println("カピバラさんが突然現れて温泉の勧誘を始めた！");
					Player[i] = "×";
				} else if (random1 == 3) {
					System.out.println("ワクワクさんが突然現れてDIYを始めた！");
					Player[i] = "×";
				} else if (random1 == 4) {
					System.out.println("布施明さんが突然現れてシクラメンのかほりを歌い始めた！");
					Player[i] = "×";
				}
			}
			if (i < 6) {
				if (Math.abs(PlayerPoint - ComputerPoint) > 6 - i) {
					break;
				}
			}

			consoleStop();
			System.out.println("---------------------------");
			System.out.println("攻守交替！");
			System.out.println("どこを守りますか？");
			System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　１　｜　２　｜　３　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("　　　　　　⚽　　　　　　");
			System.out.println(Arrays.toString(Player)
					.replace("[", "").replace("null", " ").replace(",", "").replace("]", ""));
			System.out.println(Arrays.toString(Computer)
					.replace("[", "").replace("null", " ").replace(",", "").replace("]", ""));
			System.out.println("---------------------------");
			while (true) {
				Scanner scanner = new Scanner(System.in);
				SaveZone = scanner.nextInt();
				if (SaveZone == 1 || SaveZone == 2 || SaveZone == 3) {
					break;
				} else {
					System.out.println("1～3の値を半角で入力してください");
				}
			}
			/*コンピューターがどこに蹴るか決める*/
			Random ComputerKickZone = new Random();
			int ComputerKickZone1 = ComputerKickZone.nextInt(3);
			ComputerKickZone1 += 1;

			Random random2 = new Random();
			int random3 = random.nextInt(100);

			consoleStop();

			if (SaveZone == ComputerKickZone1) {
				if (random3 > 50) {
					System.out.println("GOOOOOOOOOOOOL!!!");
					ComputerPoint += 1;
					Computer[i] = "〇";
				} else if (random3 > 10 && random1 < 51) {
					System.out.println("キーパーに弾かれた！");
					Computer[i] = "×";
				} else if (random3 > 7 && random1 < 11) {
					System.out.println("ポストに弾かれた！");
					Computer[i] = "×";
				} else if (random3 > 4 && random1 < 8) {
					System.out.println("ボールは大きく枠を外れた！");
					Computer[i] = "×";
				} else if (random3 == 0) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
					Computer[i] = "×";
				} else if (random3 == 1) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
					Computer[i] = "×";
				} else if (random3 == 2) {
					System.out.println("サンプラザ中野くんが突然現れてRunnerを歌い始めた！");
					Computer[i] = "×";
				} else if (random3 == 3) {
					System.out.println("サンプラザ中野くんが突然現れてRunnerを歌い始めた！");
					Computer[i] = "×";
				} else if (random3 == 4) {
					System.out.println("サンプラザ中野くんが突然現れてRunnerを歌い始めた！");
					Computer[i] = "×";
				}
			} else {
				if (random3 > 10) {
					System.out.println("GOOOOOOOOOOOOL");
					ComputerPoint += 1;
					Computer[i] = "〇";
				} else if (random3 > 7 && random1 < 11) {
					System.out.println("ポストに弾かれた！");
					Computer[i] = "×";
				} else if (random3 > 4 && random1 < 8) {
					System.out.println("ボールは大きく枠を外れた！");
					Computer[i] = "×";
				} else if (random3 == 0) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
					Computer[i] = "×";
				} else if (random3 == 1) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
					Computer[i] = "×";
				} else if (random3 == 2) {
					System.out.println("サンプラザ中野くんが突然現れてRunnerを歌い始めた！");
					Computer[i] = "×";
				} else if (random3 == 3) {
					System.out.println("サンプラザ中野くんが突然現れてRunnerを歌い始めた！");
					Computer[i] = "×";
				} else if (random3 == 4) {
					System.out.println("サンプラザ中野くんが突然現れてRunnerを歌い始めた！");
					Computer[i] = "×";
				}
			}
			if (i < 6) {
				if (Math.abs(PlayerPoint - ComputerPoint) > 5 - i) {
					break;
				}
			} else {
				if (Math.abs(PlayerPoint - ComputerPoint) == 1) {
					break;
				}

			}
		}
		consoleStop();
		if (PlayerPoint > ComputerPoint) {
			System.out.println("You Win!");
		} else {
			System.out.println("You Lose...");
		}
	}

	static void koukou() {
		System.out.println("あなたは後攻です");
		int PlayerPoint = 0;
		int ComputerPoint = 0;
		int kicker = 0;
		int keeper = 0;
		int i = 0;
		while (true) {
			i += 1;
			System.out.println("どこを守りますか？");
			System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　１　｜　２　｜　３　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　　　｜　　　｜　　　||");
			int SaveZone;
			while (true) {
				Scanner scanner = new Scanner(System.in);
				SaveZone = scanner.nextInt();
				if (SaveZone == 1 || SaveZone == 2 || SaveZone == 3) {
					break;
				} else {
					System.out.println("1～3の値を半角で入力してください");
				}
			}
			/*コンピューターがどこに蹴るか決める*/
			Random ComputerKickZone = new Random();
			int ComputerKickZone1 = ComputerKickZone.nextInt(3);

			Random random2 = new Random();
			int random3 = random2.nextInt(100);

			if (SaveZone == ComputerKickZone1) {
				if (random3 > 50) {
					System.out.println("GOOOOOOOOOOOOL");
					ComputerPoint += 1;
				} else if (random3 > 10 && random3 < 51) {
					System.out.println("キーパーに弾かれた！");
				} else if (random3 > 7 && random3 < 11) {
					System.out.println("ポストに弾かれた！");
				} else if (random3 > 4 && random3 < 8) {
					System.out.println("ボールは大きく枠を外れた！");
				} else if (random3 == 0) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
				} else if (random3 == 1) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
				} else if (random3 == 2) {
					System.out.println("");
				} else if (random3 == 3) {
					System.out.println("");
				} else if (random3 == 4) {
					System.out.println("");
				}
			} else {
				if (random3 > 10) {
					System.out.println("GOOOOOOOOOOOOL");
					ComputerPoint += 1;
				} else if (random3 > 7 && random3 < 11) {
					System.out.println("ポストに弾かれた！");
				} else if (random3 > 4 && random3 < 8) {
					System.out.println("ボールは大きく枠を外れた！");
				} else if (random3 == 1) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
				} else if (random3 == 2) {
					System.out.println("");
				} else if (random3 == 3) {
					System.out.println("");
				} else if (random3 == 4) {
					System.out.println("");
				}
			}
			if (i < 6) {
				if (Math.abs(PlayerPoint - ComputerPoint) > 6 - i) {
					break;
				}
			}
			System.out.println("攻守交代！");
			System.out.println("どこにシュートしますか？");
			System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　１　｜　２　｜　３　||");
			System.out.println("||　　　｜　　　｜　　　||");
			System.out.println("||　　　｜　　　｜　　　||");
			/*蹴る場所を決める*/
			int KickZone;
			while (true) {
				Scanner scanner = new Scanner(System.in);
				KickZone = scanner.nextInt();
				if (KickZone == 1 || KickZone == 2 || KickZone == 3) {
					break;
				} else {
					System.out.println("1～3の値を半角で入力してください");
				}
			}

			/*コンピューターがどこに飛ぶか決める*/
			Random kerubasyo = new Random();
			SaveZone = kerubasyo.nextInt(3);
			SaveZone += 1;

			Random random = new Random();
			int random1 = random.nextInt(100);

			if (SaveZone == KickZone) {
				if (random1 > 50) {
					System.out.println("GOOOOOOOOOOOOL");
					PlayerPoint += 1;
				} else if (random1 > 10 && random1 < 51) {
					System.out.println("キーパーに弾かれた！");
				} else if (random1 > 7 && random1 < 11) {
					System.out.println("ポストに弾かれた！");
				} else if (random1 > 4 && random1 < 8) {
					System.out.println("ボールは大きく枠を外れた！");
				} else if (random1 == 0) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
				} else if (random1 == 1) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
				} else if (random1 == 2) {
					System.out.println("");
				} else if (random1 == 3) {
					System.out.println("");
				} else if (random1 == 4) {
					System.out.println("");
				}
			} else {
				if (random1 > 10) {
					System.out.println("GOOOOOOOOOOOOL");
					PlayerPoint += 1;
				} else if (random1 > 7 && random1 < 11) {
					System.out.println("ポストに弾かれた！");
				} else if (random1 > 4 && random1 < 8) {
					System.out.println("ボールは大きく枠を外れた！");
				} else if (random1 == 0) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
				} else if (random1 == 1) {
					System.out.println("ワクワクさんが突然現れて、シュートを止めた！");
				} else if (random1 == 2) {
					System.out.println("");
				} else if (random1 == 3) {
					System.out.println("");
				} else if (random1 == 4) {
					System.out.println("");
				}
			}
		}

	}

	static void consoleStop() {
		try {
			Thread.sleep(1500); // 2秒(1000ミリ秒)間だけ処理を止める
		} catch (InterruptedException e) {
		}
	}

}
