//Se define el módulo y el controlador para angular junto al $scope
angular
		.module('cthulhuApp', [])
		.controller(
				"cthulhuAppCtrl",
				[
						'$scope',
						'$http',
						function($scope, $http) {

							// Valores iniciales del $scope
							$scope.inicializar = function() {

								$scope.profesion = [];

								$scope.restarPuntos = 0;
								$scope.fueResta = 0;
								$scope.conResta = 0;
								$scope.desResta = 0;
								$scope.apaResta = 0;

								$scope.profesion = "Profesión";
								$scope.pod = 3;
								$scope.fue = 3;
								$scope.con = 3;
								$scope.tam = 8;
								$scope.des = 3;
								$scope.apa = 3;
								$scope.inte = 8;
								$scope.edu = 6;
								$scope.valorHab1 = 0;
								$scope.valorHab2 = 0;
								$scope.valorHab3 = 0;
								$scope.valorHab4 = 0;
								$scope.valorHab5 = 0;
								$scope.valorHab6 = 0;
								$scope.valorHab7 = 0;
								$scope.valorHab8 = 0;
								$scope.calcularCorduraMagia();
								$scope.calcularVida();

								$scope.ArmaCC_1 = "Arma C.C.";
								$scope.ArmaCC_2 = "Arma C.C.";
								for (var i = 1; i < 7; i++)
									$scope["ArmaDistancia_" + i] = "Arma Fuego";
							}

							// valores iniciales para las habilidades
							$scope.iniciarHabilidades = function() {
								$scope.Antropologia = 1;
								$scope.Arqueologia = 1;
								$scope.ArtesMarciales = 1;
								$scope.Astronomia = 1;
								$scope.Biologia = 1;
								$scope.BuscarLibros = 25;
								$scope.Cerrajeria = 1;
								$scope.Charlataneria = 5;
								$scope.CienciasOcultas = 5;
								$scope.ConducirAutomovil = 20;
								$scope.ConducirMaquinaria = 1;
								$scope.Contabilidad = 10;
								$scope.Credito = 15;
								$scope.Derecho = 5;
								$scope.Descubrir = 25;
								$scope.Discrecion = 10;
								$scope.Disfrazarse = 1;
								$scope.Electricidad = 10;
								$scope.Equitacion = 5;
								$scope.Escuchar = 25;
								if ($scope.des * 2 < 99)
									$scope.Esquivar = $scope.des * 2;
								else
									$scope.Esquivar = 99;
								$scope.Farmacologia = 1;
								$scope.Fisica = 1;
								$scope.Fotografia = 10;
								$scope.Geologia = 1;
								$scope.HabilidadArtesanal_1 = 5;
								$scope.HabilidadArtesanal_2 = 5;
								$scope.HabilidadArtistica_1 = 5;
								$scope.HabilidadArtistica_2 = 5;
								$scope.Historia = 20;
								$scope.HistoriaNatural = 10;
								$scope.Lanzar = 25;
								if ($scope.edu * 5 < 99)
									$scope.LenguaPropia = $scope.edu * 5;
								else
									$scope.LenguaPropia = 99;
								$scope.Mecanica = 20;
								$scope.Medicina = 5;
								$scope.MitosdeCthulhu = 0;
								$scope.Nadar = 25;
								$scope.Ocultar = 15;
								$scope.Ocultarse = 10;
								$scope.Orientarse = 10;
								$scope.OtrasLenguas_1 = 1;
								$scope.OtrasLenguas_2 = 1;
								$scope.OtrasLenguas_3 = 1;
								$scope.Persuasion = 15;
								$scope.Pilotar_1 = 1;
								$scope.Pilotar_2 = 1;
								$scope.PrimerosAuxilios = 30;
								$scope.Psicoanalisis = 1;
								$scope.Psicologia = 5;
								$scope.Quimica = 1;
								$scope.Regatear = 5;
								$scope.Saltar = 25;
								$scope.SeguirRastros = 10;
								$scope.Trepar = 40;
								$scope.Otra_1 = 0;
								$scope.Otra_2 = 0;
								$scope.Otra_3 = 0;
								$scope.Otra_4 = 0;
								$scope.Otra_5 = 0;
								$scope.Otra_6 = 0;
								$scope.Ametralladora = 15;
								$scope.ArmaCorta = 20;
								$scope.Escopeta = 30;
								$scope.Fusil = 25;
								$scope.Subfusil = 15;
								$scope.Cabezazo = 10;
								$scope.Patada = 25;
								$scope.Presa = 25;
								$scope.Punetazo = 50;
							}

							// Calcula los puntos restantes que le quedan al
							// usuario antes de terminar el personaje.
							$scope.calcularTotal = function() {
								$scope.totalHabilidades = ($scope.edu * 20)
										+ ($scope.inte * 10) + 693
										+ ($scope.edu * 5) + ($scope.des * 2)
										- $scope.Antropologia
										- $scope.Arqueologia
										- $scope.ArtesMarciales
										- $scope.Astronomia - $scope.Biologia
										- $scope.BuscarLibros
										- $scope.Cerrajeria
										- $scope.Charlataneria
										- $scope.CienciasOcultas
										- $scope.ConducirAutomovil
										- $scope.ConducirMaquinaria
										- $scope.Contabilidad - $scope.Credito
										- $scope.Derecho - $scope.Descubrir
										- $scope.Discrecion
										- $scope.Disfrazarse
										- $scope.Electricidad
										- $scope.Equitacion - $scope.Escuchar
										- $scope.Esquivar - $scope.Farmacologia
										- $scope.Fisica - $scope.Fotografia
										- $scope.Geologia
										- $scope.HabilidadArtesanal_1
										- $scope.HabilidadArtesanal_2
										- $scope.HabilidadArtistica_1
										- $scope.HabilidadArtistica_2
										- $scope.Historia
										- $scope.HistoriaNatural
										- $scope.Lanzar - $scope.LenguaPropia
										- $scope.Mecanica - $scope.Medicina
										- $scope.MitosdeCthulhu - $scope.Nadar
										- $scope.Ocultar - $scope.Ocultarse
										- $scope.Orientarse
										- $scope.OtrasLenguas_1
										- $scope.OtrasLenguas_2
										- $scope.OtrasLenguas_3
										- $scope.Persuasion - $scope.Pilotar_1
										- $scope.Pilotar_2
										- $scope.PrimerosAuxilios
										- $scope.Psicoanalisis
										- $scope.Psicologia - $scope.Quimica
										- $scope.Regatear - $scope.Saltar
										- $scope.SeguirRastros - $scope.Trepar
										- $scope.Otra_1 - $scope.Otra_2
										- $scope.Otra_3 - $scope.Otra_4
										- $scope.Otra_5 - $scope.Otra_6
										- $scope.Ametralladora
										- $scope.ArmaCorta - $scope.Escopeta
										- $scope.Fusil - $scope.Subfusil
										- $scope.Cabezazo - $scope.Patada
										- $scope.Presa - $scope.Punetazo;
								if ($scope.totalHabilidades == 0)
									alert("Solo le queda elegir las armas para su personaje y habrá terminado");
							}

							// Genera un número aleatorio
							$scope.aleatorio = function(min, max) {
								var num = Math.floor(Math.random()
										* (max - min + 1))
										+ min;
								return num;
							}

							// Asigna valores aleatorios a las características
							$scope.valoresAleatorios = function() {
								$scope.pod = $scope.aleatorio(3, 18);
								$scope.fue = $scope.aleatorio(3, 18);
								$scope.con = $scope.aleatorio(3, 18);
								$scope.tam = $scope.aleatorio(8, 18);
								$scope.des = $scope.aleatorio(3, 18);
								$scope.apa = $scope.aleatorio(3, 18);
								$scope.inte = $scope.aleatorio(8, 18);
								$scope.edu = $scope.aleatorio(6, 21);
								$scope.calcularCorduraMagia();
								$scope.calcularVida();
							}

							// Lista de profesiones
							$scope.profesionesList = [ {
								name : 'Profesión',
								value : 'Profesión'
							}, {
								name : 'Abogado',
								value : 'Abogado'
							}, {
								name : 'Anticuario',
								value : 'Anticuario'
							}, {
								name : 'Artista',
								value : 'Artista'
							}, {
								name : 'Atleta Profesional',
								value : 'Atleta Profesional'
							}, {
								name : 'Clérigo',
								value : 'Clérigo'
							}, {
								name : 'Criminal',
								value : 'Criminal'
							}, {
								name : 'Detective',
								value : 'Detective'
							}, {
								name : 'Diletante',
								value : 'Diletante'
							}, {
								name : 'Escritor',
								value : 'Escritor'
							}, {
								name : 'Fanático',
								value : 'Fanático'
							}, {
								name : 'Granjero',
								value : 'Granjero'
							}, {
								name : 'Guardabosques',
								value : 'Guardabosques'
							}, {
								name : 'Ingeniero',
								value : 'Ingeniero'
							}, {
								name : 'Intérprete',
								value : 'Intérprete'
							}, {
								name : 'Investigador Privado',
								value : 'Investigador Privado'
							}, {
								name : 'Médico',
								value : 'Médico'
							}, {
								name : 'Miembro de Tribu',
								value : 'Miembro de Tribu'
							}, {
								name : 'Misionero',
								value : 'Misionero'
							}, {
								name : 'Músico',
								value : 'Músico'
							}, {
								name : 'Oficial Militar',
								value : 'Oficial Militar'
							}, {
								name : 'Orador',
								value : 'Orador'
							}, {
								name : 'Parapsicólogo',
								value : 'Parapsicólogo'
							}, {
								name : 'Piloto',
								value : 'Piloto'
							}, {
								name : 'Policía',
								value : 'Policía'
							}, {
								name : 'Profesor de Universidad',
								value : 'Profesor de Universidad'
							}, {
								name : 'Soldado',
								value : 'Soldado'
							}, {
								name : 'Trotamundos',
								value : 'Trotamundos'
							} ];

							for (var i = 1; i < 9; i++)
								$scope["hab" + i + "List"] = [];

							// Lista auxiliar
							$scope.otraList = [ {
								name : 'Antropologia',
								value : 'Antropologia'
							}, {
								name : 'Arqueologia',
								value : 'Arqueologia'
							}, {
								name : 'Artes MArciales',
								value : 'Artes Marciales'
							}, {
								name : 'Astronomia',
								value : 'Astronomia'
							}, {
								name : 'Biologia',
								value : 'Biologia'
							}, {
								name : 'Buscar Libros',
								value : 'Buscar Libros'
							}, {
								name : 'Cerrajeria',
								value : 'Cerrajeria'
							}, {
								name : 'Charlataneria',
								value : 'Charlataneria'
							}, {
								name : 'Ciencias Ocultas',
								value : 'Ciencias Ocultas'
							}, {
								name : 'Conducir Automovil',
								value : 'Conducir Automovil'
							}, {
								name : 'Conducir Maquinaria',
								value : 'Conducir Maquinaria'
							}, {
								name : 'Contabilidad',
								value : 'Contabilidad'
							}, {
								name : 'Credito',
								value : 'Credito'
							}, {
								name : 'Derecho',
								value : 'Derecho'
							}, {
								name : 'Descubrir',
								value : 'Descubrir'
							}, {
								name : 'Discrecion',
								value : 'Discrecion'
							}, {
								name : 'Disfrazarse',
								value : 'Disfrazarse'
							}, {
								name : 'Electricidad',
								value : 'Electricidad'
							}, {
								name : 'Equitacion',
								value : 'Equitacion'
							}, {
								name : 'Escuchar',
								value : 'Escuchar'
							}, {
								name : 'Esquivar',
								value : 'Esquivar'
							}, {
								name : 'Farmacologia',
								value : 'Farmacologia'
							}, {
								name : 'Fisica',
								value : 'Fisica'
							}, {
								name : 'Fotografia',
								value : 'Fotografia'
							}, {
								name : 'Geologia',
								value : 'Geologia'
							}, {
								name : 'Habilidad Artesanal',
								value : 'Habilidad Artesanal'
							}, {
								name : 'Habilidad Artistica',
								value : 'Habilidad Artistica'
							}, {
								name : 'Historia',
								value : 'Historia'
							}, {
								name : 'Historia Natural',
								value : 'Historia Natural'
							}, {
								name : 'Lanzar',
								value : 'Lanzar'
							}, {
								name : 'Lengua Propia',
								value : 'Lengua Propia'
							}, {
								name : 'Mecanica',
								value : 'Mecanica'
							}, {
								name : 'Medicina',
								value : 'Medicina'
							}, {
								name : 'Nadar',
								value : 'Nadar'
							}, {
								name : 'Ocultar',
								value : 'Ocultar'
							}, {
								name : 'Ocultarse',
								value : 'Ocultarse'
							}, {
								name : 'Orientarse',
								value : 'Orientarse'
							}, {
								name : 'Otras Lenguas',
								value : 'Otras Lenguas'
							}, {
								name : 'Persuasion',
								value : 'Persuasion'
							}, {
								name : 'Pilotar',
								value : 'Pilotar'
							}, {
								name : 'Primeros Auxilios',
								value : 'Primeros auxilios'
							}, {
								name : 'Psicoanalisis',
								value : 'Psicoanalisis'
							}, {
								name : 'Psicologia',
								value : 'Psicologia'
							}, {
								name : 'Quimica',
								value : 'Quimica'
							}, {
								name : 'Regatear',
								value : 'Regatear'
							}, {
								name : 'Saltar',
								value : 'Saltar'
							}, {
								name : 'Seguir Rastros',
								value : 'Seguir Rastros'
							}, {
								name : 'Trepar',
								value : 'Trepar'
							}, {
								name : 'Ametralladora',
								value : 'Ametralladora'
							}, {
								name : 'Arma Corta',
								value : 'Arma Corta'
							}, {
								name : 'Escopeta',
								value : 'Escopeta'
							}, {
								name : 'Fusil',
								value : 'Fusil'
							}, {
								name : 'Subfusil',
								value : 'Subfusil'
							} ];

							// Lista auxiliar
							$scope.ElegirFanList = [ {
								name : 'Derecho',
								value : 'Derecho'
							}, {
								name : 'Electricidad',
								value : 'Electricidad'
							}, {
								name : 'Farmacologia',
								value : 'Farmacologia'
							}, {
								name : 'Quimica',
								value : 'Quimica'
							}, {
								name : 'Fusil',
								value : 'Fusil'
							} ];

							// Lista auxiliar
							$scope.ElegirPolList = [ {
								name : 'Artes Marciales',
								value : 'Artes Marciales'
							}, {
								name : 'Conducir Automovil',
								value : 'Conducir Automovil'
							}, {
								name : 'Equitacion',
								value : 'Equitacion'
							}, {
								name : 'Regatear',
								value : 'Regatear'
							}, {
								name : 'Descubrir',
								value : 'Descubrir'
							} ];

							// Lista auxiliar
							$scope.ElegirProList = [ {
								name : 'Antropologia',
								value : 'Antropologia'
							}, {
								name : 'Arqueologia',
								value : 'Arqueologia'
							}, {
								name : 'Astronomia',
								value : 'Astronomia'
							}, {
								name : 'Biologia',
								value : 'Biologia'
							}, {
								name : 'Derecho',
								value : 'Derecho'
							}, {
								name : 'Fisica',
								value : 'Fisica'
							}, {
								name : 'Geologia',
								value : 'Geologia'
							}, {
								name : 'Historia',
								value : 'Historia'
							}, {
								name : 'Historia Natural',
								value : 'Historia Natural'
							}, {
								name : 'Medicina',
								value : 'Medicina'
							}, {
								name : 'Quimica',
								value : 'Quimica'
							} ];

							// Lista de armas
							$scope.armasCCList = [ {
								name : 'Arma C.C.',
								value : 'Arma C.C.'
							}, {
								name : 'Bastón Estoque',
								value : 'Bastón Estoque'
							}, {
								name : 'Cachiporra',
								value : 'Cachiporra'
							}, {
								name : 'Cuchillo de Carnicero',
								value : 'Cuchillo de Carnicero'
							}, {
								name : 'Cuchillo de Combate',
								value : 'Cuchillo de Combate'
							}, {
								name : 'Estoque',
								value : 'Estoque'
							}, {
								name : 'Florete',
								value : 'Florete'
							}, {
								name : 'Hacha',
								value : 'Hacha'
							}, {
								name : 'Navaja',
								value : 'Navaja'
							}, {
								name : 'Palo Grande',
								value : 'Palo Grande'
							}, {
								name : 'Palo Pequeño',
								value : 'Palo Pequeño'
							}, {
								name : 'Piedra',
								value : 'Piedra'
							} ];

							// Lista de armas a distancia
							$scope.armasDistanciaList = [ {
								name : 'Arma Fuego',
								value : 'Arma Fuego'
							}, {
								name : 'Pistola .22',
								value : 'Pistola .22'
							}, {
								name : 'Derringer .25',
								value : 'Derringer .25'
							}, {
								name : 'Revolver .32',
								value : 'Revolver .32'
							}, {
								name : 'Automatica .32',
								value : 'Automatica .32'
							}, {
								name : 'Revolver .38',
								value : 'Revolver .38'
							}, {
								name : 'Automática .38',
								value : 'Automática .38'
							}, {
								name : 'Revolver .41',
								value : 'Revolver .41'
							}, {
								name : 'Revolver .45',
								value : 'Revolver .45'
							}, {
								name : 'Automática .45',
								value : 'Automática .45'
							}, {
								name : 'Fusil .22',
								value : 'Fusil .22'
							}, {
								name : 'Carabina .30',
								value : 'Carabina .30'
							}, {
								name : 'Fusil Lee-Enfield .303',
								value : 'Fusil Lee-Enfield .303'
							}, {
								name : 'Fusil 30-06 Cerrojo',
								value : 'Fusil 30-06 Cerrojo'
							}, {
								name : 'Escopeta Calibre 20 (2 Cañones)',
								value : 'Escopeta Calibre 20 (2 Cañones)'
							}, {
								name : 'Escopeta Calibre 16 (2 Cañones)',
								value : 'Escopeta Calibre 16 (2 Cañones)'
							}, {
								name : 'Escopeta Calibre 12 (2 Cañones)',
								value : 'Escopeta Calibre 12 (2 Cañones)'
							}, {
								name : 'Escopeta Calibre 10 (2 Cañones)',
								value : 'Escopeta Calibre 10 (2 Cañones)'
							}, {
								name : 'Escopeta Recortada (2 cañones)',
								value : 'Escopeta Recortada (2 cañones)'
							}, {
								name : 'Thompson',
								value : 'Thompson'
							}, {
								name : 'Gatling',
								value : 'Gatling'
							}, {
								name : 'M1918',
								value : 'M1918'
							}, {
								name : 'M1917A1',
								value : 'M1917A1'
							}, {
								name : 'Coctel Molotov',
								value : 'Coctel Molotov'
							}, {
								name : 'Dinamita',
								value : 'Dinamita'
							}, {
								name : 'Granada',
								value : 'Granada'
							}, {
								name : 'Lanzallamas',
								value : 'Lanzallamas'
							} ];

							// Funciones para mostrar u ocultar los círculos
							// asignados a la edad, la vida, la cordura y la
							// magia
							$scope.calcularCorduraMagia = function() {
								$scope.corduraStyle_Locura = {
									border : 'solid'
								};
								for (var i = 0; i < 100; i++) {
									if (i <= ($scope.pod * 5))
										$scope["corduraStyle_" + i] = {
											border : 'solid'
										};
									else
										$scope["corduraStyle_" + i] = {
											border : 'none'
										};
								}

								$scope.magiaStyle_Inconsciente = {
									border : 'solid'
								};
								for (var j = 0; j < 44; j++) {
									if (j <= $scope.pod)
										$scope["magiaStyle_" + j] = {
											border : 'solid'
										};
									else
										$scope["magiaStyle_" + j] = {
											border : 'none'
										};
								}
							}

							$scope.calcularVida = function() {
								$scope.vidaStyle_Muerto = {
									border : 'solid'
								};
								$scope["vidaStyle_m1"] = {
									border : 'solid'
								};
								$scope["vidaStyle_m2"] = {
									border : 'solid'
								};
								for (var i = 0; i < 44; i++) {
									if (i <= Math
											.ceil(($scope.con + $scope.tam) / 2))
										$scope["vidaStyle_" + i] = {
											border : 'solid'
										};
									else
										$scope["vidaStyle_" + i] = {
											border : 'none'
										};
								}
							}

							$scope.calcularEdad = function() {
								if ($scope.edad > ($scope.edu + 16))
									$scope.edu += parseInt(($scope.edad - ($scope.edu + 6)) / 10);
								if ($scope.edad > 40)
									$scope.restarPuntos = parseInt(($scope.edad - 40) / 10);
								else
									$scope.restarPuntos = 0;
							}

							// Dependiendo de algunas características se rellena
							// el bonificador
							$scope.calcularBonif = function() {
								var aux = $scope.fue + $scope.tam;
								if (aux > 2 && aux <= 12)
									$scope.bonif = "- 1 D 6";
								else if (aux >= 13 && aux <= 16)
									$scope.bonif = "- 1 D 4";
								else if (aux >= 17 && aux <= 24)
									$scope.bonif = "Nula";
								else if (aux >= 25 && aux <= 32)
									$scope.bonif = "+ 1 D 4";
								else if (aux >= 33 && aux <= 40)
									$scope.bonif = "+ 1 D 6";
								else if (aux >= 41 && aux <= 56)
									$scope.bonif = "+ 2 D 6";
								else if (aux >= 57 && aux <= 72)
									$scope.bonif = "+ 3 D 6";
								else
									$scope.bonif = "+ "
											+ (3 + parseInt((aux - 72) / 16))
											+ " D 6";
							}

							// Inicia el proceso de cálculo de todos los datos
							$scope.calcularFicha = function() {
								if ($scope.profesion == ""
										|| $scope.profesion == "Profesión"
										|| $scope.profesion == null)
									alert("Por favor, elija una profesión");
								else {
									document.querySelector("#calculoFicha").disabled = "true";
									$scope.calcularBonif();
									$scope.calcularEdad();
									$scope.iniciarHabilidades();
									if ($scope.restarPuntos != 0)
										document.querySelector("#restarLink")
												.click();
									else
										$scope.calcularHabilidades();
								}
							}

							// A partir de la base de datos asigna las
							// habilidades que corresponden según la profesión
							// elegida
							$scope.calcularHabilidades = function() {
								var sumaTotal = $scope.fueResta
										+ $scope.conResta + $scope.desResta
										+ $scope.apaResta;
								if ((sumaTotal < $scope.restarPuntos)){
									alert("Quedan puntos por distribuir");
								} else if ((sumaTotal > $scope.restarPuntos) || isNaN(sumaTotal)){
									alert("Ha asignado más puntos de los que debe");
								} else {
									$("#restar").modal("hide");
									$scope.fue -= $scope.fueResta;
									$scope.con -= $scope.conResta;
									$scope.des -= $scope.desResta;
									$scope.apa -= $scope.apaResta;

									var dataPro = {
										index : $scope.profesion
									};

									var res = $http.post(
											'/cthulhu/profesiones', dataPro);
									res
											.success(function(data) {
												var arr = $.map(JSON
														.parse(angular
																.toJson(data)),
														function(el) {
															return el
														});
												$scope.profesionReparto = [];
												for (var i = 1; i < 9; i++) {
													if (arr[i - 1] == "Otra")
														$scope["hab" + i
																+ "List"] = $scope.otraList;
													else if (arr[i - 1] == "ElegirFan")
														$scope["hab" + i
																+ "List"] = $scope.ElegirFanList;
													else if (arr[i - 1] == "ElegirPol")
														$scope["hab" + i
																+ "List"] = $scope.ElegirPolList;
													else if (arr[i - 1] == "ElegirPro")
														$scope["hab" + i
																+ "List"] = $scope.ElegirProList;
													else {
														$scope.profesionReparto = $scope.profesionReparto.concat([arr[i - 1]]);
														if (arr[i - 1] == "Habilidad Artesanal"
																|| arr[i - 1] == "Habilidad Artistica"
																|| arr[i - 1] == "Otras Lenguas"
																|| arr[i - 1] == "Pilotar") {
															document
																	.querySelector("#textoHab"
																			+ i
																			+ "_aux").style.display = "";
														}
														$scope["hab" + i
																+ "List"] = [ {
															name : arr[i - 1],
															value : arr[i - 1]
														} ];
														$scope["textoHab" + i] = arr[i - 1];
														document
																.querySelector("#textoHab"
																		+ i).disabled;
													}
												}
												$scope.profesionHttp = arr;
												document.querySelector(
														"#sumarLink").click();
											});
									res
											.error(function(data, status) {
												alert("Ha fallado la petición. Estado HTTP:"
														+ status);
											});
								}
							}
							
							$scope.checkSubValue = function(i) {
								var textHabilidadModificada = $scope["textoHab" + i];
								if (textHabilidadModificada == "Habilidad Artesanal"
									|| textHabilidadModificada == "Habilidad Artistica"
									|| textHabilidadModificada == "Otras Lenguas"
									|| textHabilidadModificada == "Pilotar") {
								document
										.querySelector("#textoHab"
												+ i
												+ "_aux").style.display = "";
								}
								var habilidadAñadida = [textHabilidadModificada];
								var profesionAux = [];
								for (var x = 0; x < (i-1); x++){
									profesionAux = profesionAux.concat($scope.profesionReparto[x]);
								}
								profesionAux = profesionAux.concat(habilidadAñadida);
								for (var x = (i-1); x < ($scope.profesionReparto.length); x++){
									profesionAux = profesionAux.concat($scope.profesionReparto[x]);
								}
								$scope.profesionReparto = profesionAux;
							}

							// Asigna puntos a las distintas habilidades
							$scope.sumarPuntos = function() {
								var todoCorrecto = true;
								var sumaTotal = $scope.valorHab1
										+ $scope.valorHab2 + $scope.valorHab3
										+ $scope.valorHab4 + $scope.valorHab5
										+ $scope.valorHab6 + $scope.valorHab7
										+ $scope.valorHab8;
								if (($scope.textoHab1 == null
										|| $scope.textoHab2 == null
										|| $scope.textoHab3 == null
										|| $scope.textoHab4 == null
										|| $scope.textoHab5 == null
										|| $scope.textoHab6 == null
										|| $scope.textoHab7 == null 
										|| $scope.textoHab8 == null)
										|| (sumaTotal < ($scope.edu * 20))) {
									alert("Quedan habilidades por seleccionar o puntos por distribuir");
									todoCorrecto = false;
								} else if ((sumaTotal > ($scope.edu * 20)) || isNaN(sumaTotal)) {
									alert("Ha distribuido más puntos de los que debe");
									todoCorrecto = false;
								} else {
									var arr = $scope.profesionReparto;
									for (var i = 1; i < (arr.length+1); i++) {
										var habilidad = '';
										if (arr[i - 1].split(" ")[1] != null) {
											habilidad = arr[i - 1].split(" ")[0]
													+ arr[i - 1].split(" ")[1];
										} else {
											habilidad = arr[i - 1];
										}
										
										if (habilidad == "HabilidadArtistica") {
											habilidad = "HabilidadArtistica_1";
										} else if (habilidad == "HabilidadArtesanal") {
											habilidad = "HabilidadArtesanal_1";
										} else if (habilidad == "OtrasLenguas") {
											habilidad = "OtrasLenguas_1";
										} else if (habilidad == "Pilotar") {
											habilidad = "Pilotar_1";
										}
										
										if ($scope["valorHab" + i] > (99 - $scope[habilidad])){
											todoCorrecto = false;
										}
									}
									
									if (!todoCorrecto) {
										alert("Alguna de las habilidades tiene una cantidad de puntos superior a la permitida");
									}
								} 
								if (todoCorrecto) {
									$("#sumar").modal("hide");

									var arr = $scope.profesionReparto;
									for (var i = 1; i < (arr.length+1); i++) {
										var habilidad = '';
										if (arr[i - 1].split(" ")[1] != null) {
											habilidad = arr[i - 1].split(" ")[0]
													+ arr[i - 1].split(" ")[1];
										} else {
											habilidad = arr[i - 1];
										}
										
										if (habilidad == "HabilidadArtistica") {
											habilidad = "HabilidadArtistica_1";
										} else if (habilidad == "HabilidadArtesanal") {
											habilidad = "HabilidadArtesanal_1";
										} else if (habilidad == "OtrasLenguas") {
											habilidad = "OtrasLenguas_1";
										} else if (habilidad == "Pilotar") {
											habilidad = "Pilotar_1";
										}
										
										$scope["texto" + habilidad] = $scope["textoHab" + i + "_aux"];
										$scope[habilidad] += $scope["valorHab" + i];
									}
									
									alert("Distribuya los puntos que le restan como desee. En la parte derecha de la pantalla se muestran los puntos restantes.");
									document.querySelector("#restantes").style.display = "";
									$scope.calcularTotal();
								}
							}

							// Cuando se modifica el tipo de arma y esta es del
							// tipo que se lanza, se calcula los datos asociados
							$scope.calcularArmaLanzar = function() {
								if ($scope["ArmaCC_1"] == "Piedra")
									$scope.calcularArma(1);
								if ($scope["ArmaCC_2"] == "Piedra")
									$scope.calcularArma(2);
								for (var i = 1; i < 7; i++)
									if ($scope["ArmaDistancia_" + i] == "Coctel Molotov"
											|| $scope["ArmaDistancia_" + i] == "Dinamita"
											|| $scope["ArmaDistancia_" + i] == "Granada")
										$scope.calcularArmaDistancia(i);
							}

							// Cuando se modifica el tipo de arma, se calcula
							// los datos asociados
							$scope.calcularArma = function(i) {
								if ($scope["ArmaCC_" + i] == "Arma C.C.") {
									$scope["ArmaCCHabilidad_" + i] = 0;
									$scope["ArmaCCDano_" + i] = "";
									$scope["ArmaCCManos_" + i] = "";
									$scope["ArmaCCAlcance_" + i] = "";
									$scope["ArmaCCAtaques_" + i] = "";
									$scope["ArmaCCPR_" + i] = "";
								} else {
									var dataArm = {
										index : $scope["ArmaCC_" + i]
									};

									var res = $http.post('/cthulhu/armas',
											dataArm);
									res
											.success(function(data) {
												var arr = $
														.map(
																JSON
																		.parse(angular
																				.toJson(data)),
																function(el) {
																	return el
																});
												if (arr[5] == "Lanzar")
													$scope["ArmaCCHabilidad_"
															+ i] = $scope["Lanzar"];
												else
													$scope["ArmaCCHabilidad_"
															+ i] = parseInt(arr[5]);
												$scope["ArmaCCDano_" + i] = arr[1];
												$scope["ArmaCCManos_" + i] = arr[7];
												$scope["ArmaCCAlcance_" + i] = arr[6];
												$scope["ArmaCCAtaques_" + i] = arr[2];
												$scope["ArmaCCPR_" + i] = arr[0];
											});
									res
											.error(function(data, status) {
												alert("Ha fallado la petición. Estado HTTP:"
														+ status);
											});
								}
							}

							$scope.calcularArmas = function() {
								for (var i = 1; i < 7; i++)
									if ($scope["ArmaDistancia_" + i] != "Arma Fuego")
										$scope.calcularArmaDistancia(i);
							}

							// Cuando se modifica el tipo de arma a distancia,
							// se calcula los datos asociados
							$scope.calcularArmaDistancia = function(i) {
								if ($scope["ArmaDistancia_" + i] == "Arma Fuego") {
									$scope["ArmaDistanciaHabilidad_" + i] = 0;
									$scope["ArmaDistanciaDano_" + i] = "";
									$scope["ArmaDistanciaFdefect_" + i] = "";
									$scope["ArmaDistanciaAlcance_" + i] = "";
									$scope["ArmaDistanciaAtaques_" + i] = "";
									$scope["ArmaDistanciaCapacidad_" + i] = "";
									$scope["ArmaDistanciaPR_" + i] = "";
								} else {
									var dataArm = {
										index : $scope["ArmaDistancia_" + i]
									};

									var res = $http.post('/cthulhu/armas',
											dataArm);
									res
											.success(function(data) {
												var arr = $
														.map(
																JSON
																		.parse(angular
																				.toJson(data)),
																function(el) {
																	return el
																});
												if (isNaN(arr[5]))
													$scope["ArmaDistanciaHabilidad_"
															+ i] = $scope[arr[5]];
												else
													$scope["ArmaDistanciaHabilidad_"
															+ i] = parseInt(arr[5]);
												$scope["ArmaDistanciaDano_" + i] = arr[1];
												$scope["ArmaDistanciaFdefect_"
														+ i] = arr[4];
												$scope["ArmaDistanciaAlcance_"
														+ i] = arr[6];
												$scope["ArmaDistanciaAtaques_"
														+ i] = arr[2];
												$scope["ArmaDistanciaCapacidad_"
														+ i] = arr[7];
												$scope["ArmaDistanciaPR_" + i] = arr[0];
											});
									res
											.error(function(data, status) {
												alert("Ha fallado la petición. Estado HTTP:"
														+ status);
											});
								}
							}
						} ]);