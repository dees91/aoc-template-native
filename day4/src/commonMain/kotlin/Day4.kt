fun main() {
    val lines = readInput().split("\n")
    println(part1(lines))
    println(part2(lines))
}

fun part1(lines: List<String>): Any {
    return search1(lines)
}

fun part2(lines: List<String>): Any {
    return search2(lines)
}

private fun readInput(): String = """
XSXMAAXXSSMMMXMXSXMSXMXSAMXSXMASMMSSMMSASXSAAXAAMXMMAMAMXMXSMXSAMXAXSAMXSSSXMASAMXAAMXSXMASAMXXMAXXSAXAMXMMSAASMXMXMASMMAMXXXSAMMSMMSXMASXAA
XXAMMSMMXMAMAASXSAMAMSAMASASMSASAAAAAXSASAMMMXSMXSAMSSMMASMSAAXXSXAMSAMXMMXMSAMXXXMSMAMMAMXMSSMMMSSMMSASMSXAMMMAASMASAMXSSXSASMSXMAMSASXMMSS
SSSMAAXAAXAMMXSASXMAMMASAMXSAMAXMMSMMMMAMXMAXXAAASAMAAMSMSAMMMSMXMSAXASXSAAMMXSAMXMAMMSMXMAMAAMXAXAAASXMAMXMXAMSAMAXMASAXAXMAMXXAMMMMAMASAMX
XAAMSSSSMSSXSAMAMAMXMSXMASAXMMAMXMXMMAMAMXSAMSMMMSXMMSMAAMXMMXSAAAMSSXMAMSMSAAXAXASMSAMMAXMMSSMMMSMMMXAMSMAXSXMMAMXXXXXMMMMMSMMSXMASXSSMMSXM
MSMMAXXAAXAAMXMASAMXASXSXMASXSXMASXAXMAXXXMMMMAAAXAMXMMMSMAMXAXXMSXAMXMXMAMMMMSMSMSXMAMSSSXAXAMAASAMSSMMASXMAMXSAMXSMSMXAXAAAAXXAXAMAMXXXMXX
XMASMMSMMMMMMAXAXMSMMSAMXAMXXASMAMMMMSSSMSSMASXMMSSMAMAMAXAXMSSXMXMMMXMAMMSSSXMAAAXXSMMSAMMXSMMMMXAMXAXSMXXXXAMXAMAMAAASXSMMSSMMMMAMSXAMAMMX
SSMMMAMXAAAAXMMMSMXAXMAMXSXMAMAMASAMXXAAAAAMXSAAXAAMMSMMMSSSMAAXSAXMAXXASXAAMAMSMMSXMAMMAMXXMXAXMSSMSSMMASMSMSSSXMAMSMXAMAXAXAAASXSAXMASASAM
MAASMSMSSSSSMSAAAXMAMMXMAXAMXXMSASASMMSMMSSMASXMMSSMAXMSMAAAMMSMSASMAXSMMMMSMAMXAASMSAMSSMMXMASMXAAXAXXSMSAAAXAAASAMMXMASAMXSXSMSAMMMAXAMSMS
SSMMAAAAAXXAASMSMMMSMSSMMXAMAMXXXSMMXAAXMMAXAMMSMAAMSSMAMXSMMMXMXAMMMXSXAAXAMAXSMMXAXSXXXAXASAXMMSSMMSMAXMXMMMMSXMASMXSAMASMSAMXMXMMASMMASMM
AAAMXMASMMMMMMAAXAAXAAXAMSMMASMMMMASMSSSSSSMXSAAMASAAMXASMAMXSASMSMXXAMMSMSAMXXSXSMSMMMSSSMXSAMXAAAAAXAMXMAXSAMXXSAMMAMXSSMAXMASMSXSMXAXAMAS
SSMMXSXMASXAAMSMMMSSMMMXMAAXMSXAAAMXAXAAMAAAXMXMSXMMXMMMMAAMASASAXMSMASMMAXMSMMMAMAXAAXMAMMAMXMMMSMSMMMXASXMSASAMXASMMMAMXMXMSMSXSASAXXMXXAM
MMMMAMASXMASXXASXAAXAASASMSMASAXMXXSMMMXMSMMMASXSXSAMXASXSSSMMMMAMAMMAMMMSMAAAXMAMASXMSMSMMASAMMMXMMASXSXSMASXMAXSXMAAXAAMSSMMAXAMAMSXXASMSS
MAAMASAMAMMMMSASMMMSSMXASAAMSMMSMSAMMAXXMXXASAMAMAXAMSAMAAAXXAMMMMXMMMSXAMMSSSMXXSAMAASAAXSAMAMSASASAMXAAMMAMAMXMSSSMMXMXAAAAMMMMMXMASMAMAMA
SSMSXMASASAAXMAMXAMMXAMSMXMXMAAAAMXMMASMMMSMSAMAMXMXMMAMMMMSSMMAASASAASMMSAAAAXAMMMSMMMSMMMAMSMMASXMASXMMMMXSXSXAMASAMASXMSSMMSAXASMAXMAMAMX
MMMXXMASASMMSMMMSMSAMXMMAMXASMMMXMAXXXSASAAXSXMXASMMXXXMSAMXAMMXMSAMMSMAXMMMMMMMSAMAMXXAXXMXMXAMXMASMMAXSAMXMAXAMMAMXMAXAAAXAXMAMMXAMXMXSXXS
MAXMAMXMXXASXAXAMMMAMMMMAMMMSXAMAXSSSMSAMSSMMSXMXAAMSSMXSASXMMSXMMMMXXMSMMASAXAASXMAXSAMXSSMMSAMXSXSASAMXASMMAMAXMXMMMMSMMMMMMXAMXXXMSXAAMXS
SAXSAMXAMSXMSMMSSMSAMAAXAMXAXMSXSAAAMAMXMAXAXMXAXMAMAAMMSAMXAASASAXXASXMAXAMMXMMSXAXXAXXMMMAAMMMXMAMAMAMXXMAMASMSSSMSSMAMMSAAXMMXXXAXXMMXSAX
MAMSAMXMXMAAAXMXAASASMSMMSMSSXMAXMMMMSMAMMMMMMSMMSAMSSMAMXMMMMMAMXSMAMASMMMMMXMXMMSMMMSMASMSMSSSMMAMAMAMMMXSSMSAAAAXAASMXAMSSMAMSAMXMMMSAMMS
XMMSAMXMASXSMSMXMMMAXAMAAAAMMAMXMXSXXASMMMASAMAAXMAXMAMMSMSMSSMAMAMMSMMMMXXAXAXAAAAAAAAXXAAMAMAAASASASASXXAMAMMMMMMMSMMMMMXAMMXMAMAAAAAAAMXS
AMXXMAXXAMMAXAMASMMSMAMMSMSMSAMMMASMXMASXSASASMSMMSAMMXSAAAAAMMMMSXAMMSASASMSMSMMMMMMSSSSMXMAMMMMXASMMMSMSXSAMMXXAXAXAAAAXAMXSMMXMSSSMSSSMAS
XXAASASMAMSSSXSAXAAXMXMXMMMASASXMASAAXAXMMASMMAMMAAASXXSXMMSMXAXAAMXMASAMASAAAMMSSMXMXMAAXSSXXXAXMXMXSAMAAASASMMSSMSSMMMMSSXAMAAXMXAAAAAAMAM
MMSXMAXMXMXAAXMMXMMSAMXASXSASAMMMASXSMXSAMXMAXSAMXSSMAMMSMAMASXSMXAXMXMMMMMMMMMAAAMMMAMSMMXAASXMMSAAAMAMMMMMMXAAXASAMXXXXAMMMXAMMMMXMMMXMMAS
AAXAMMMMMMMMXMASAXXAMXMASASAMAMAMAXMMAAAMSSMMSAMXAXMMMSAAMAMXMAAXAMMXMAMXXAAXXMMSSMASAMAMMMMAMAAASMSMSXMMSAMXSMSMMMMXSSMMMSASAAXAASMSMSAXXAM
MXXAMMAAAXAXXMAMMSSMMAMAMAMMMXMMMXSSXSMMASAASAMAMMSAAAMMMXMXAMXMMSSMMSMMMMSSXSAMXAMMSASXMAAXXSSMMSXXAMAMXMASXMAAMAAXMAMAAXSASXSSSXSAAASASMSS
XSSMMSSSXSAMMMSXMAAAMXSXMXMMAXXXXMXMAMXXXMMMMAXXSASMMSSMMASXMMAMXAAAASAXSAMAASXMSSMMSAMMSXSSMMMAMXMMSMXMAMSMAMSMSSSSSMSMMMMAMAMXMSMMMMMAXAAX
MMASMXXAXMASXAMXMSSSMMMAMXMAASMMSXAMAMXXSSMSMSMMMASMAXAAMAXAAASMMSSMMSAMXMMMMMAAAAAXMAMMSAAMAXMXMXMAAAXSXSMSAMXXXMAXXAAMMAMXMAMAXXMAMAMXMMMS
MSAMMSMSMSMMMMXAXMAXMASAMASMMSAASXMMMMSAMMASAMSAMSMMMSAMMSSMMMXAAAAAXMXMSMAXASMMSSMMSMMAMMMSXMSMSAMMMSXMSAMXXXXMSAMXMSMSXXMASAMXXMSSSMSASAMX
MMASXMAAAAXXAMSSMMMMSASASXSAASMMMMXAAAMAMMAMMMSXSAAAAXAMAMAMXXSMMSAMXAXMXSAMXXXAXAMMAMMSXSASXAAASMSSXMASAMSMMMMXSXXXAAAMMMMASASMSMAAAAXAMXSS
XMAMAMSMMMSAXMAMXXAMMAMASMSMMSAAAXSMMMSMMMXSMASMSMSMSXXMXSAMXXMXMAXMMMMMAMMSSSMSSMMSASAMSMASMSMMMAAXASMMXXAASXAAMMMSSMSMASMMSAXAAMMSMMMSMSMM
SMSXMMMXMSMMMMMMAMSMMSMMMAXMASMMSMXAAMAMXMASMASASAMXMAMXASASMMSAMAMXAAAMASXAAAXAAXMSAMXXAMXMAXMSMMMSMMMMMSASMMMXMAMXMAMXAXAXMMMSMMAMAAAAMAAX
AXXASASAMAAAXAAAAAXAAXAXMMMMXMAXXAXMMSASAMXSMMMXMAMASXAMMSMMAXSXSSSSSSSSXSMMSMMMSMXMASMSMSXSXMXMAXMAAAXXAAXMMXAMXXMXMAXMSSSMAAAMAMASXMSMSSSM
MMSMMASMSSSMMXMSMSXMASXMXMASASMMMMSMASASASASASXSSXMASAMMXSMSSMMAXAAAAAAAMXMAXXSXMAXMXAXAAMAMAASASXSSSMSMSSMMXMXSAMSMMASAAAMSSMMXAMAXMXMMXAAX
XAAAMMMAAXMAXSAAAXAMAXAXXXAMMSAAXAAMXMASXMASAMAMAMMXXAXSAMAAXAMAMMMMMMMMSAMXMASASMXXMMMMSMAMSXMAMMAMXAMAAMAXXAAMMMAAXMAXMMMXMAMSAMXSMAMMMXMM
MSSSMAMMMXSAAMSMMMXMASMMMMSSXMMMMSSSXMXMXSXMAMAMAXXAMSMMASMMSSMXMAAAAAAXSMXMSXSAMXSXMXAAAMXMMAMSMSSSMXMMMSSMAMMSXSSSMMSXXXAMMAMMMMXAMASAXMXM
XXAXXASMSXMXSMXXXAMAMSXAAMXAMXASXXMAXMMAMAMSAXMMXMMMXXASXMAXXMASXSMSMSSMMSAMXAMXMAXAMSMSSSMSSMMAAMAXMASXMAMSAMXMAMMAMAAMXMAMMASXSXSMMMSAMSAS
AMAMXMSXMASXMMSMXMSAMXXSXMSAMSXSASMASXAAAMXSAMSASASXMSAMXSXMXMSMAXXMXMMXAAXXMAMXMMSMMAMAAXXXASXMSMXMASXAMAMAXMAMAMSAMXSSSXMASMSAMXXAAMMMMSAS
XMASAMXMXMMXMASAMAXAXAMMMMMAMXAMASMAXASXSXAMMMXAXASMMMSMAAAAAMMMAMAXXSAMSMSXXAXMAXAMXAMMSMMMAMXMAXSMMXMXSSSMMSMMXMMASAMAMXAAXAMAMAMXMSASMMMM
ASASAMMMAMXXMMMXAMMSMSXSASXSMMAMAMMSSXMAAMXSSMMMMXMAAAAMASMSMSAMMSSMAMMMMAMASMXMSSXSSMMMMMSAMMXSMSXAAMXAMMAXAASMSMSMMXMAMSMMSSSSMXSAAMXMAMXX
MMASAMSXMMMXMSMSSXAXAXASXMAAASMMXSAAXAMSSMAMXXAMXXXSMSXSAAAAASXSAAAMXMSAMAMAMXAXMAXXASAAAAXMMMXMXAMSMSMMSSSMSSMXAAXXXSSXMXAXAAAXMASMMMMSXMSS
XMXMMMMASXSXSAAAAMMSAMXMAMSMMMXSAMXSMXMXAMXMASMSMMMMAMAMXSMMMMMMMSXMXSMMSSMXSMXMMXMXAMSXMSSMASAMMAMXASAMXAAAXMXSMMMMXMAXSSSMSMSMSAMXASXMASXA
XSAMXSSMMAAXMMMMSAAAXXAMAMAAMXXMASXMASXSXMAAXMMAASXSAMXMXAMXAXAAXXMSMXAAAAAAMMSXSASMMMAXSAMXXMASXSSMMMAXMSMMMAAMMAAMMMSMXAMAMAXMMMXSAMAXMMSM
MXMXMAAAMMMMMSAMXMSSSSSSMMXXMSAMXSXMSMMXMSSSMMSSMMAMXMXMSXMSMSSSMMAAAXXMSSMMSMAAMAXXAMASMASXXSAMAAXMMSSMAMXMMMMSSSSMMAMXMXMAMMMSAAMMMSXMAAAX
MMMAXMSMMMSAAMASXMAMMAMXMASXMSAAAXMXMXMXMAXAMAAXAMXMAMAAMAMMXXXMMMSMMMAMXMAMAMMSMMXSXSMSXMMAMMAMMMMXASXMAMMMASXMAAAMMASASXMMSMAMXMXAAAASMSSS
SASMSAXMAAMMXSAMAMMSSMSAMXAAASAMXSMAMAMASMSSMMSSSMMSSSMXMAMAXXAXMXAASXMMASAMMXAXAXXMASMMASMXMXAMAAAMXSXSASASASAMMMMSSXSASAXAAMMSASMMMSMMAMAM
SMSAXMAMMXSAXMASXMXMAASXMASMMMXSAMMASASASAAAAXAXMAMXXAASXSMMSSMMSAMXMAASASXSXMSSMMMSAMASAMXAMSMSSXSAXMASXSXMASMMMXAMXXMASAMSMSASMMSAMXMMXMAM
MXSMAXSXXAMMSMAMXMAMMMMAMAMXMSAMASMMSXXAMMMMMMSMSAMSMMMAAXAXAXMAMMXSSSMMAMXAMXAAAAXMAXAMAXMXXAMXXXAMAMAMXMAMXMAAXMSSXMAXMAMMAMASAMSMMSMXXXAM
MAMXMSXSMAMMMXAXAMMMMXSXMAMMXMAMAMXAMXXXSASXMAXASAXXAAXMMMMMSSMXSXAXMAASAMAXMMXSMMSSMMASAMSSMAXAMMSMXMXSMMSXMXSMSXXAXMXXMAMMMMAMXMXXAMMAMSAS
MASAMXAMSSMMMSXXMXSASAMXMAMXXXMMSSMMASAASMMSMXSMMSSSSMSXMAAAAAAAXMASXSMMASMMXXXAMXAAXSAMAXAASMMMAAAMAMMMMAAASMMASMSMMMSMSMMAXMXMSMMMSSMMMAMX
SASAXMAMAMAAAXMSMAAAMXSAMXASXMMAAAASASMXMAAXMMMMAXMAMXMASXSMSSMMXSXAMAXXAMXMASAMXMMSMMASMMSMMSAXSSMSASXSMMSSMASASAAXAXAAAASMMMXXSAMAAAMSMASM
MASAMSMMMSSMXXAAMXSMMMMAMXXAAAMMSSMMASXMSMMMXAXMASMAMMMXMMAAXXAMASMXSAMMSSMMASMMXSMXMMMAXXMAMXXXXAASASMAXAXXMAMAMMMSMXMSMMAMSMSXXAMMSXMAAXMM
MAMAMSAMXAAAAMXMSMXAXXSAMXMAMMMAAAAMXMAMAAMSMSSXXXMAXXXMMXMXMMMMASAAMASAAAXMASASAMMAXAXMASXSMMSSMMMMXMASMXSASXMAMAMAXAAAMXMAAAAXSSMMMASXXMXX
MMSMMSAMXSMMMSAAAASXMXMASAASMSXMSSMMSSMSSSMAAMAMSXSASMMSMSMASAMXMMMMSXMMXSMMASXMAMSAMXXSMXAAXXAAMMMMAMSMMXSAMXMAXMSASMSMSAXXMXMXAMAAXMMASXXS
MMXMASAMXMASASMSMMSMSSSMMXSMAMAMXXMAAAMMAMXMMMAMXAMASAAAAMSAMAXMMSMMMXXAAXAMAMAXAMMMMSAXXMSMMMMSMAASAXAASAMXMASXSAMXSAMASASXSMXMASMMXAMXMXAA
SAMMMSAMXSAMXXAXXAXAAAASXXXAAMMMMAMMSSMMAMXMXSXMMMMAMMSMSMSSSSXSAAXAAXMXMSAMSMSMAMAAAMXMAMAAXXAXMSMSSSMSMXSAMMSXAXXXMXMASAMASMASXMMXAMXSMMAM
SAMXXSAMXMMSMMSMMMMMMSMMMASXMXXAXAMXXAXSXMASAMXSAXMXSAMAMXMAXAAMSMSMMSMMMSMMXAXSMMMMMXASMSMSMMXMAXAMXMXAAASASXXXMMSMMSSMMAMAMMXSMAAASXMAMAAM
SAMSMSAXMAXAAXXAMXSXAAAXMAMXAXSXSASXSMMSASASASAMSSXAMMSAMSMXMMMMAXXAXAAAMMAMMXMAMXAASXMSAAAAXXXMASAXAMSMMMSMMMMMXAXAAMAASXMAMMXMXMMMMASMXSMS
SAMXAMXMMMSMSSXXMAMMXXMMMXXMSMAAMAMAMXASAMXSXMASAMMMSASAMXAXSXSMSMSXSSMSXSAMXASAMXMMMAAMXMSMMXMAMXMMAXMAMMXAASASMSSSMSXMMMSXMSAAXXMASAMMAMAM
XAMXMMSSMMAMXAXSMSXSASMMSAXSAAMXMAMAMMXMAMAXMMXMMSAMMMSAMMMMMASAMXXMAAAMAXAXXMXAMSSSSMMMMMMXXMAAMAXMXMSAMSSSXSMSAMMXXSMMAXAAASMMMXSAMXMMASAA
XXXAXSXAASMMXSMMAMAMAXMAMMMSASMSSMXSMSASAMMXXXAXXMAXAASXMAASMAMAMAXASMMMASMMSSSSMAAAXXMXXAAAMAXAXXSMSAXXSAMXMMXMAMAXXMASMSMMMSAXSAMASMMMMSMM
MSAMXAMMMMAMXXAMAMXMXMMAMMMSAMXXASAAASASXSXXMSMSAAMSMMSMSASMMMSAMSSMAXXXXSXAXAAMMMMMMXSMSMXSASMSMAMMMSXMAXXMASASAMXMMSAMXXXMAXXMMASAMMAAAMAX
AAMMXMSSMSAMXSSMSSSXMMSMMAMMMMAMAMMMMMAXMAMAAAXMASXAMMMXXXXMXXMAAMAXMSXSAMXSMMMMXXXXMXMAAAAAMXAMAAXAAMMMMMMMMSXSXSAXMAMSXAMXSXAMSXMMSXSSSSMM
SSXSMXMAASMSXMXMMAXSAMAMSMSASXSMSXXXAMXMXAXMSMASAMXXXAMMSMSMSXSMMSMMXSAMXMAXASMXMXMMAAMXMMMSXMMMXMXMMSAAAMXXXXAXAMMXXMSMMMMAXMMXMXMASAMAAXXA
XMAMAAMMMMAMAMXSMXMXMMAXAASASAXAMXMXASMMSSMMAXXMASASMMMAAAAAXAXAAXXMAMXMAMASAMAAMAAXSASXXSAXXAXSASXAAXXSSMMAMXAAMSMSMMAXAAMXSAXMMXMAMSMMMMMS
MMMMSXSXMAMSAMAMMSMXMSSSMXMMMXMMMASAMXAAAAMMSMXMAMXMASMXMSMSMMMMXMASAMASASAMXMSSSMSXMAXXASXSXSASASMSMXXXMAASXAMSXAMAASASXSSSMXSAMAMMSXXMAMAX
XSXAXASAXAXSXMASAAMAMAXAXMAMASMXSASASXMMSSMAMMSMXMAMXMSAAXXXAMASAMXASMAXASMXAXAMXMXAMXMMAMAMAAXMAMAXXXXAMXMMAMSAASMSMMMSAXMAXASXMAXXAMXSASMX
AXMMSMMMMXMMXMMMMMSASMSMMMSMASAAMXSXMXSAMXMAXAAXMSSMMAXMXMASAMSMMSMAAMXSXMMASMMSAASXMASAAMAMMMMMSMMMAMXAMAXSAMMMXXAXAMMMMMSMMMSASMSMASASXAXX
SSMXAMAASMMSAXAXAMXXSXAXMAMMAMMMSAMASMMMSMSSMMMMMAMAMXXXSAMSSMXMSAMAMXAMAAXMAAXSXMAAXXXSXSAXXAXMAAXMAXSAMAMMMXAXMMSMMMAAAXAXAXSAMAMMMMASXMXS
AXMAMSSMSAAAMSSSMMSAMXSMMXXMASXAMASMMSAXSMAXMASXMASXMMMSAMXMAXAMMASMXMMSMMMXMSAMXSXMMMMMMSMXSXSSSSMMAMSXMXSASMMSAXXAASXSXSAMXMMAMXMAXMXMAMAS
MSSXXAMXMMMMMMMAAAMAMAMAMMMMXMMXSMMAASXMSMSMSASAMXSXAAMMMMASMMSSMXMMAMXAAAAXXXAAASMMSXMAAMMASMMXXAAMSMSASAMMSAMXMXMMMMAAXXMXAXXXMASXSAMXMMAS
XMAMMMSXXXAXASMMMMSXMASMSAAXSXAAAMSMMMSAXAXAMMSAXMMXSXXAXSMXAAAAMAAXAMXSSMSMASXMAMAAMASAMSMASAXMMSMMMASAMXXMMMMMMMMSSMMMMSSSMMAMSMSAXAAXXMAS
XMAMAAMMMSSSMMAMAMXMMXSASMMSAMMSSMXAAXMSMXMASMXMXASMMMSMXASMMMSSSSSMMXMAMAAMMMMSSSMMSMMASXMAXMMMXAAAMMMAMAMSMSAXXXAASAMXAXAAMSMMAXMXMSMSAMXM
XSASMXSAXAAMASMMASAMXAMXMASXMXAXAXSMMSAMXXSMMMAMSMSAAAAXSAMSAXAMAAXAAMMAMSMXAAAMXAXMAMXXXXMXSSSMASMMSXXAMAXAASXSMMMSSMMSSMMMMAAXXMMMMAAXXMSM
MSASAXSXMMSMAAASMMASMXMAXXXAXMMMMMXAXXMXSXMMASAXXASXMMSMMAMSXMASMMSMMMMXMASAXMSSSMMSASMMMMMSXAAXAXAAAXXSSSSMXMXSAAMAMAAMASAXSASMSAMASMSMSMAS
MMMMMXMXMXXMMSMMMMAMMASMSAMXMMSASASMSASAMXXSASMSMMMSMAXAXAMXMXXMXXXXXSAMXMXSAAMAXXMSASAAAASAMSMMMSMMMSXAAMMXAMMMSSMMSMMMSMXXMXMAMASAMXAAXSAS
MAMAMASASMXXXAXXAMAASMAMXXAAMXSASAAASAMAMSAMXSAMAAASMSSMMMXAAXXASMSAMAXXXXAXMMMMMXAMAMXMXXAAMAAAAXAAAAMMMXSSMSMAAMAXXMSXXAMSSMSSSMMAMSMSMMXS
SASASXSAXAASMMSSXSSMXSAMMMMASAMAMMMXMASXSMXMASASAMXSAASAASXSMSMAMAAXXAMSSMMSXMAXMMMMXMASMSSSSSSMSXSMSSXSAAMXAAMMMSMMMMMXMAMAAXAAXXMAMMAAAMMS
SASAAAMXSMMMAAAXMMMMMMXSAXSMMXSMMXXXSAMMAMXMASAMXSXMMMXMMSAAASMAMXMXMMSMAAAXMMMSAAXSMMMAAXAAAAAMMMMMMXAXMSSMSMSMMMMAMASMMMMXSMMSMMSSMSSSSMAX
MAMAMXMXAXSSXMMSSSMAAMSMMMASAASXMXSXMASXMMXMAMXMMAMSMMSSMMMMMMMAXASAAMAMSMMMMAXSMMXAAAXMXMMMMMMMSAMMSMSMAAMMXXAXMASMMAXAAAAXXXMAAAAXAAAXXMSS
MSMSMAMXMSMASASAMXMMXMAAAXMMMSMAMXMAXAMXXMSMASAXMAXAAMAAXSASAMSMXASMMSAXXAMAMSMMSSMSSMSXSXMXMXMASAXMXAAMMMXMASMMSAMXMSXXMMSXXAMASMMMMMSMXMAM
MAAMAMXAXAXMAMMMSMXMXXMSSSXXXAXAMSAMXSAMMSMSAXXSXSMSSMSSMAMMAMASMAMMMMMMSAMXXMAAAXXAXXSMAMMASMMMSAMSMMMSMMMXMSXMMSXMAMASXMMMSSMXMAAXXMAMSASX
SMSMXXXASMSXXXAXAAAXMSMAMMMSSMSSSXMXAXAMXAAMXSXMAXAAXAMXAMXSXMAXMAMXAAMXSAMXMSMMMSMMSXXMAMSAMAAAXAXXAAAXAMXSXSAMAMXSAMXMAAXAAXMAXSAMXSAMMAMX
MAMAXMMMAXAXXSSSMSMSAAMAMAAAXAAMMMAMXSAMSMSMXAASAMMMMXMASXMAMMXMSMSSSSMAMASAMAXAAXAASMSMAXMASXMSSMMSMMSSMMAMMSAMXSXMASMSMMMMMSSSMXASAMAMMXMM
MAMAMAASAXMMAMAMXMAAMMSSSMSSMMMSAMXMMMMMXAAAXSXMASXSAXSXMASMXSAMAAMAAMMSMAXAXSSMXSSMXAAMXSSXMXXXAMASAAAXXMASASAMMAASXMMSAMXSXAAAASMMASAMMSMS
SSMMXSMSMSMMMMASAMXMAXAAAAMXAMASMSASAMASMSMSXMASXMAMSMMAMMMXASXSMSMMMMAAMMMSAAAMAMMXMSMMMMXMAMXSSXASXMMSXSSSMSAMAMMMAAASAMAMXMSMMMASAMASXAAX
MMASMMAMAMXAXSASASMXXMASMMMSSMAXMMAMXSASXXAMMXAXAMXMAMSSMSAMXSAXXXXMMMSSSMAXMSSMASMSMXSAAMAMAMXXAMXSASXSAXAMXSAMSMASMMMSMMXMAXAXAMXMASAMXMMM
XSAMAMAMSXSXXMASAMXMSXMXMAXMMMSXSMSMMMMXMMSMAMXSSMSSMXAMAMSXAXMASXMSAAXAAMXMMAMMXSAXMAMXMSASASXMMAMSAMMMMMSMMMXMAMASASASXAXSSSMSXSASMMMXAMAA
AMAMSMMMAASMXSASXXSSMASXSMSAMXXAMAMSMASXXAAMAMAAAAAAMMMSXMXMMMMMMMASMSMSMMMSMASXMMMMMMSAASASMSMAXMXMXMAMSAMAMXSSXXMSXMASMSXMMAAAASMMAXMSMSMS
XSAMXAXAMXMAXMASAXSASAMXXXMXMASMMMMXSAMAMXMMASMSMMMSMMAAASXAAAAAAXXXAXXMAMSAMAXXAAXXAAXMMMXMASASXMMSMSMSMASXMAXAXSAMMMSMXMASMMMMMMASXMMAXMAM
XXASXMMSXSMSMMSMMMSAMXSMMASAMXXSAAMMMMSSMASAAAAMXMXMAMMSSMASXXSSSSSXXSMSMXSASASMMMSMMSMMASAMAMXMAMXAXAXXMMMXXXMAMSAMMSMAXSAMXAMXSXMASXMAMSAS
MSMMASAMSXAAXXAAAXMXMXAXXMAMMAMSMXXSMAAAMASAMMMMXAASXMAMAMMMSMMAMXXMMMMAMASAMXSAAAAAXAASAXAMXSMSAMSMMSSMASMMSMMMMSAMXASMMMXSSSMMXMXAMMASMSAS
MAAXAMAXMMXMAXMMMXMASMMMSMAMMAMMSMASMMSSMXSAMXXMMSMSAMXSMXAAXMXSAMXXAAMAMMSAMASXMSSSMSMMASMMMMXMAMAAAAXXAMAAXAAMMMXMMXXXMXMAAMXSAMMXSAMMAMAM
SSXMXXMASMSSSXXASASASAXAASASMMMAAMXMAMMAMXSMMXAXXAASXMAMXSMSSSMXAXMAMMMSMXXAMXSXMAXMMMAXAAAAAMMMMMSMMSMMMSMMMSASAMSSSMSSMMAMXMASAMAAAXMMSMAM
XAXSMSSMXAAAMMSXSASASAMSMSMSASMSSSMSXMXAMMMMSSMSSMXMXSXSASXAAMASMMSMMSAXMMSXMXMASMMMSSXMASMSXSAMSAMXAMXAAMASAMMMASAAAXAAASXXSMMSMMSSMXXXXSXS
MSMXAAAXMMMMMAMMMAMAMMMXXSXMASAAAAMMAMSSMMAAMAXAAXAXXMAMASMMSMXMAAAAAMASAAAAMMSAMAAAAMAMXXAAMXXAMXMMSMSAMSAMAMXSMMMSMMSSMMSMXMXMMAMAXAMAMXMS
MASXSMMMMAAAMSSXMAMXMASXAXXMAMMMSMMSAMXAASMSSSMSSMSSSMAMMMAMAXASXMMMMSAAMMSXMASASXMMSSSMSMMMMAMMSSXSAAMAAMMSMMAXAXXXAXXAXAMXAMAXMAMXMXMAMAAX
SASMMMAASXSMSAAMSMSMSASMAMMMMSAMXMASMSSMMMAAAAAMXAXAXXAMASXSAXMXMMXAMMXSAMXMMMSAMXMXAAXAAAAAMAXSAMXSASMMMAMAAMXSMMSSXMSXMXSSMSSSSMSSSXSASMSS
MASAXMMMSXAMMMSMSAAXMAXAXXAAAMMSAMASXAXASMMMSMMMMXMAMXSSMSAMXXSAMMSMSMAXAXMASAMMMAAMMMMMSSMSXSSMASAXMMXXMASMSMMMMAXAAMMAMXXAAXMAAAAAMASAMAAM
MXMXMASAMXXXXXMAMSMMMSMSXSSMMSASMMASMASXMASXAAAMMMSSMAXAXMAMAMMAMAASAMXXMSSMMMXAMXXXXXXXAMXXAMAXAMXSMSXSSXMAAAAXXMXMMMSAMMSMMMMSMMMSMAMAMMMS
MMMAAMMAXXSSMSMXMMSAXMAMAMAAAMXMXSXXMMXXSSMSSSMSAAXAMSSMMSAMASXSMSXSXSXXMAMAMSMSSXSAMXMAASAMXSAMXMAAAAXMMAXSSSMSMMSMMXMAAAXAMXMAMMXMMMSSMMMX
XAMXSMXMMAAAAMMAMMMSAMAMAMMMMMSAMMAXSMMMMAAAXMAMMMSAMXAXAXASXSAXAMXSAMMAMAXMMSXMAASXAAMAMMXSAMXMMMSMAMSSMMMMAXMSAAAASMSMMMSMSMSSXSAAMAAAAXXM
SSSMAAASMSMMSMMASAAMMSASAMXAMXAAAMSMXAAAXMMSSMMSAMXMXSMMMMXSAMXMMMAMAMXXAMXMAMAXMMMMSXSASXAMXSXXAAMXMXAXAXAMXMASMMSSMAAXSMSAAAMAASXMMMXXMMMX
AXXAMSMSAAMAMASASAXMASXSASMSSXSSMXAAXSSXMXAMMAMSASASMAMASMMMMMMXMMAMMMSSMSAMASXMXAXMXMMAMMXMMAMMMXSASMSSXSSSMMMXMXMXMMMSMAMAMSMMMMMSXSSMSAMS
XMASXXXMMMMASAMXSASMASAMAMAAMXMAMSMSMMAMSMMSMSMMASASMXMAXAAXSAAASMMXXAXAAAMSASAMSMSAMXSAMXXXMXXXAXSAMAAMXXAAXSMAMAMMXXXMMSMXMXXXAXAXAMAMSASA
XMXMXMXSXXMXSXMAMAMMMMAMXMAXMASAMSAMXMAMMAMXXXAMXMAMASMASMMMSASASAAAMSSMMMXMMSAMSASXMAXMMSSXMSSMMMMMMMMSMMSMMAMMSMSAMSSMAXASXXSSMSSMMMAMXXMA
MSAMASAMMMMAXASXMXMAXSXMXASXSAXMSMXMMMMXSAMMXSAMXMXMMXMAXMAXXMMASMMSXMAMAMAMMSAMMAMXMMXSAMXXSAMXSMAXXXMAXAXASMAXAMXXMAAMASAMXAMAMAMAXSMSSMAX
ASASAMASAAMAMXAXMAMXXMAXXMAXMXMMMMXMSAMXSASAMXMXSMSMXSMMMSXMAXMXMXXMASMMASXSAMASMXMAMXAMXMMSMASAMXSMMMSMMMSMMXMMASAMMSSMASAMXXMAMAMMMAAAAASM
MSAMASASMSSSXMMMMSSMAXMASAMXMSMSAMAXSASASMMMAMMAAXMMAXAAASASXMXSXMAMMMXSXSAMXSAMMASASMMMSAMASAMXSAXAAAAMAMAMMAMSAMAXAXAMASAMMMSMSXSSSMXMMSXA
MMMSXMASMMMMAMXXAASXXAMXAAXXMAMSAXXXSXMAXXAAAAXSMXSMSSSMMSAMMMAMMSMMAMASMMXMXMXSXXMASMXASASASMSAMMSXMSMSMSASXMXMMSSMMSMMMMAMXAAMSXMXXXAMXMMS
XAMXMMAMASXSAMAMMSSMMSSMSSSMSXXSAMSMMXSASXSSSMMASAAXMAXSXMMMSMASAAAMXMASXSASAXAMMMMSMMMMSXMASAMASAXXMXASMSXMAXXXXAXAAAXASXMMMSSXSASMXSXSASAM
MMMAMSSSMMASASAAMMXAAAAAAAAAMMAXAXSAMAMMXAAMAMSAMSXMAAMXMASAMXAMMSSMAMASAAAMAAXSAXXXASXAXMMMMXMXMASXMSMMASXSXMMMMMSMMMSMSAAXAXMASMMMMSMMASMM
MASAMSAMXMXMXSMSMAMMMSXMMXMMMAMSMASAMXSAMSMMAMMMMXMSMMSAMXMASMSSXAAMAMXMXMXMXMSAXSASAMMMSAAAMAMXMAMXAAAMXMASAMAAAAAAAAAASMMMSSMAMAAXAXAMAMAM
SASXSMMMXSMSAMXAMASXAXMSSXMAAXXMXMSMMASAMXASXSASMMASAMSXMXSXMAXMMSMMMSAMXXAXAMXMMMXMMMXXAXSSSSSXMSSMSMSSXSAMASXSSSSSMSMXMXSAMAMASMMSMSSMXSSM
MASXXXXXMMAMMMSASASMASAAAASXSSSMAXSXMAXXMSAMMSAMXMAMAMXMAXSAMXMXAAAAXMAMSXSSMSAXXXSXMASAAMXAAXAXSAMXMSAMXMAMXMAAAXAXAMXMSXMAMSMMMAXMMSAMXMAS
MAMMMSMSAMAMAXXAMAXAMMMMSXMAAAAXMSMMMMXMXAMXAMSMXMXSXMXXMAMXSAMMSSMMSXSMSAAAASASXXXASASASMMMMMXXMAXASMMSMSSMMMMMMMXMMMSSMMSSMAASXMMAXSAMXSAM
SSSMXAAAXXASMSMXMMMXXAXAXAMXMSMMXAAMMAASXXMSSXXMAMAMXMXMSSSMSAMMAXMASAMASMMMMMMAMASXMASAMXXXAAAMMSSMSMXSAAXAAMAMAXXAAAXAAAAAMXMMAASAMXSAMXMS
SAAXXMSMSSMSAXXAAAASXSSSSMMXAMXAMXMMMMMXAAXAMXMAXMSMAAMAAMAASAMMAXSAMAMAMAXMXAMAAXXXMAMAMMMSSSMSAXMAMXAMMMSSMMXSSMSXSSSXMMSSMSSMSMMAAXMSAMXS
MSMMSAAXMAMXMMMSSMXSAAAAAMMSSSMXSASXAXMMSMMASMMAXSASASMMXSMMMMMMAMMASXMXSXMXSXMMMMSMSASMMSAMAAAMASXMSMMSSMMMXXXXMASAMXMASAXAAAAMMXMMMMSAMXAS
XAMAAMSXSMMXXSXAAMSXMMMMMSAAAXAAMMMSASAAAAXSMXMAXSAMMXMSMSAMXAMXMXMXMAXAMAMXSMMSAASASMXMASMMXMMMXMASAMMAMAAAXXMSMSMMMASXMASXMSSMSSMSAMXXMMMS
SASMMXAASXMXMMMSSMAMSMXMAMMSMMMMMSAMXSMSSSMMASMMXMAMMSMAASAMSXXAXMAXMSMSSXXMXAAXMSMMMAXMXMASMSAMASXMAMMAXSMMSMAXMMAAMXMXXAMXMAMXAAXMASMXMAAX
SXMAXMMXMAXXSAAMAMXSAAAMASXXAMAAAMMSASXAAXAMXMASMMMMAMSMMSAMXSSSSSXSAXAMMMMMMMMSSXMAMXMSMXXMASASASMSSMXMXXAAMMSMMSSMSMMSMASMXXXMMSMSXMAASMMS
MMSXMASXSXMAXMXSSMSMMSMSMMMSMMMMSSSMMXMMSMSMAMXMMSMMXMSXXMAMAMSAAAAMXMAMAAAAASXMMAMXXMAAXSAMXSXMAMXXASXSAMMMSAMXXAMMAAXMSAMXXXXXXXAAAMMMXAXA
MAXAMXMASAMMSMMSXMAXMAMXMXMAMASXXXMASXAXXAMXSXMXXAAXMXXMSSMMAXMMMMMMMSSMSSSSSSXMMMMMMSSMMASMAXAXXMMMAXXMAMSAXXSMMMSSMXAXMXSMMSMMMMMSMMAXSSMX
MSSSMSAMSXMMAAXXAXAASASAMMXASAXAAXSAMXSAMXMAMASMSMSMSMAAMAASMMSASXXXXAMMMAMXMMMXASAAXAAXSAXXXMSMSAAMMAMMMMAAMXXAAAAAMMSXMASXAAAAXAMAMXXMAAXS
AXXMAXXXXXMSSSMSMMSASASXSASMMXSSSMMMSAMMSSMSMAMAAXMAASMMSXMMAXSAMXASMMSSMSMMAAXMASXMMSSMMASMSAAAXXXMXASASXXAMMXSMSMSXAXAMASMSSSMSSSMSAXMSMMA
MSMMAMSMMSAAAMAAXXXAMAMAMMSAAAXAXMASMASMMAAXMMMSMMMSMXMMXMMMXMMAMAMXSAAXAAAMSASXMMMXAMXAMXXAMSMSMMMMSXSASMSMAXXXAXAXMASAMXSAMAXMAMXXMAXMAAAS
XAAMAMAAASMMMMSMSMMXMAMAMXXMMMMMMMSMSAMASMMMXXAMXAAMXMSAMAAXSXSASXSAMMSMSSSMMAXXAAMXSMMXXAMSMAMAXAAAXAMAMASMMAMMAMMMAAMMXXMAMAMMXMXSSSSSMXXA
SSSMMSSMMMXXXAMXSAMASMSMSMXXXXAAAMMAMXSMMXMMXMASXMXSAMSASMMMSXXASAMXSXMMMXMXMXMXMXSAXAXSMSAASMSASXMMSXMAMMMAMXXMAMASMSSMSSSMMSSMSAXXAMAAAMSM
AXAXAAXASMMSAAMAMXSAXAAAAMMMMXSMSSMAMXAXMMAMXMMAMAAMAXSAMMSXSAMSMMMAMAAMXAMASMMASAMXSAMXAAXXXXMMXXAMXASXSSSMMSASXSAXXAAAAXAXAAAMAXMMMMSMMMAX
XMMMMSSXMAASMSMAXAMXSSMSMMAASXMSAMXAMXMAMSAMXSMAMMMSMMMXMXSAMXMAAXMASXMXMMMMXAXAMAMAXMMMSMMSSSSXXAMMXAMAMAAAAAMSXMASASMMMXSMMSMMMXXAMXMXAXSM
SMXAXXAXXMMMAMMSMASMXXAAMSSSSXMMXXSMXAXMASASAXMAMAXAAASMSXMAMMSMSMSAMMMXMAAXSMMMSSMXXAAAMAXXAAXMMSMAXMMMMSMMSSXSAAAMAMXMSAMXMMXSXMSSSMMSMSXS
SMASXXSSSSSMMMAMSMMAAMXMMAMAMAXMMMMMXSSMXSAMXSSMXXXSSMXAAMSSMAAXXAMASXAASXMMAAAAAAAASMMSSSSMMMMMAAMXSAAXAAAAMMAXMMXSAMXAMASXMAAXAAXMAAAXSMAA
XAAMXAAAXXAMXMAXAXXMMSAMMSSSSXMAASASAXAMAMXMXMASAMXXXMMMMXAXMXSMMXSAMMSXSASMSSMMSSMMXXAAXMXMXXSMSXXAAXXMSSMMSMSMSAMMMMMXSAMAMMMSMSXXSMMSAMMM
MMMSMMMMMSAMXSXSMSSXAXAMSAAXAMSMXSAMXMAMMXMAMSAMXAMMAMSMXMMSSMMMSAMASAMXSXMAAXXMXMAXMMMMSMMMMMMMXAMSSMXXAAAXAAMXMAXSMXSMMXSAMMXSMMXXXAXSAMSX
AAAXXAAAMXXMXSAAXAMMMSXMAMSMMAMMAMXMASXMSAAAAMMSMXAMAMXAMAXAAAAXMASMMXSAMMMMMMAXAMMMSXAAAAAXAMAAMAMMAMMMMMAMMSMMSSMAAASASASMMSASAMXMSMXXMMSX
SMSXSSSMSMMMAMMMMAMAAMXMSXXAXASMSMMSAMAASMMXSAAAAXSSSSXAMSMXSXMXSAMAXAMAMMAMAMMMSMSAXSXSSSMSSSSSSSMSAMMASMASAAAMAMXSMMMSMASAAMXMMMXMAXXXSAMM
XAMMMXXXMXAMXSAMXSSMXSAMAMXSMASXAAMMASMMMMXMMMSMXMAAAXXXMXMMMMSMMMSSMMSSMSASASMMMAMXXMMMMAXXMAXXXXASXXMAMSAMXSSMASXXAAXXMSMMMSMSAASXXSMMMASA
SASMSAMMMMMXAXAMAXAAXSMSASAMMXXMSXMMMMAXMSAASAMASMMMMMMSAMXASAMAAMAXAAXAASASASAAMAMSAXAAXXMMMSMMMMXMASMAMMXMAXAXAMASMMSAMXAXAAAMMMMXAMXAMXMM
SAAXMXMAAASMSSSMMSMAMSASASAXSMMMMXSAMSSMAXSSMAMAAXXAAAMAAMSMSASXMSMXMAMMMMAMXSMMSAMSASXSSMXXAAAAAAXMAMMXMASMMSAMXSXMMAMMASMMMMSMMSMMMSASMSMM
MSMXAASMSXSAAAASMXXAAMAMAMAMAAXSMASAMAAMSMMXMAMXSASMSSSSSMAASAMXXAXXSAMXAMXMAXAXSMXMAMAAMAXMSSSSSSSMASAMXAXAXMASAMAAMAMMAXAAXAAAAAAAAAAMXMAS
AXXSSMSXMMMMMSMMSAMSSMXMSMASXSMXMASXMSSMXXMASXSXXXSAMXMAMXMMMMMXSSMXAXMASXMMMSAMXSXASMMMMMSAMXXMAXXXXSASMSXSAMXXMSAMSSSMASXMSMSMSSSMSSSXASMM
""".trimIndent()
