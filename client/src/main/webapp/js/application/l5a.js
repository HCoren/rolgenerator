var app = angular.module('l5aApp', []);

app.controller("l5aAppCtrl", ['$scope', '$http', function($scope, $http) {

  // Valores iniciales del $scope cuando se va a generar la ficha
  $scope.inicializarFicha = function () {
	$scope.rango=1;
	  $scope.experiencia = 0;
	  $scope.reconocimiento=100;
	  
	  $scope.tierra = 2;
	  $scope.resistencia = 2;
	  $scope.voluntad = 2;
	  
	  $scope.aire = 2;
	  $scope.reflejos = 2;
	  $scope.consciencia = 2;
	  
	  $scope.agua = 2;
	  $scope.fuerza = 2;
	  $scope.percepcion = 2;
	  
	  $scope.fuego = 2;
	  $scope.agilidad = 2;
	  $scope.inteligencia = 2;
	  
	  $scope.vacio = 2;
	  $scope.calcularEstiloVacio();
	  
	  $scope.rangoHonor = 0;
	  $scope.rangoGloria = 0;
	  $scope.rangoStatus = 0;
	  $scope.rangoMancha = 0;
	  
	  $scope.iniciativaModX = 0;
	  $scope.iniciativaModY = 0;
	  $scope.armBonif2 = 0;
	  $scope.heridasMod_Ini = 0;
	  for(var i=1; i<8;i++) $scope["heridasMod_"+i] = 0;
	  $scope.curacionMod=0;
	  
	  for (var i=1;i<24;i++) $scope["habilidad_"+i] = "Habilidad";
	  for (var i=1;i<24;i++) $scope["especialidadesList_"+i] = [];
  }
  
  // Valores iniciales del $scope
  $scope.inicializar = function() {
	  $scope.rango=1;
	  $scope.experiencia = 0;
	  $scope.reconocimiento=100;
	  
	  $scope.tierra = 2;
	  $scope.resistencia = 2;
	  $scope.voluntad = 2;
	  
	  $scope.aire = 2;
	  $scope.reflejos = 2;
	  $scope.consciencia = 2;
	  
	  $scope.agua = 2;
	  $scope.fuerza = 2;
	  $scope.percepcion = 2;
	  
	  $scope.fuego = 2;
	  $scope.agilidad = 2;
	  $scope.inteligencia = 2;
	  
	  $scope.vacio = 2;
	  $scope.calcularEstiloVacio();
	  
	  $scope.rangoHonor = 0;
	  $scope.rangoGloria = 0;
	  $scope.rangoStatus = 0;
	  $scope.rangoMancha = 0;
	  
	  $scope.iniciativaModX = 0;
	  $scope.iniciativaModY = 0;
	  $scope.armBonif2 = 0;
	  $scope.heridasMod_Ini = 0;
	  for(var i=1; i<8;i++) $scope["heridasMod_"+i] = 0;
	  $scope.curacionMod=0;
	  $scope.arma1BonusX=0;
	  $scope.arma1BonusY=0;
	  $scope.arma2BonusX=0;
	  $scope.arma2BonusY=0;
	  
	  
	  $scope.clan = "Clan";
	  $scope.familia = "Familia";
	  $scope.escuela = "Escuela";
	  for (var i=1;i<24;i++) $scope["habilidad_"+i] = "Habilidad";
	  for (var i=1;i<24;i++) $scope["especialidadesList_"+i] = [];
	  $scope.armTipo = "Armadura";
	  $scope.arma1Tipo = "Arma";
	  $scope.arma2Tipo = "Arma";
	  for (var i=1;i<6;i++) $scope["flechasTipo_"+i] = "Flechas";
	  $scope.multiplicador = "2";
  }
  
  // Lista de clanes
  $scope.clanesList = [
	{name:'Clan', value:'Clan'},
	{name:'Cangrejo', value:'Cangrejo'},		
	{name:'Grulla', value:'Grulla'},			
	{name:'Dragón', value:'Dragón'},			
	{name:'León', value:'León'},			
	{name:'Mantis', value:'Mantis'},			
	{name:'Fénix', value:'Fénix'},				
	{name:'Escorpión', value:'Escorpión'},			
	{name:'Unicornio', value:'Unicornio'},			
	{name:'Araña', value:'Araña'}			
  ];
  
  // Lista de familias - Se rellenará dinámicamente
  $scope.familiasList = [
	{name:'Familia', value:'Familia'}
  ];
  // Lista de escuelas - Se rellenará dinámicamente
  $scope.escuelasList = [
	{name:'Escuela', value:'Escuela'}
  ];
  
  // Lista de habilidades nobles
  $scope.habilidadesNobleList = [
	{type:'Habilidades Nobles', name:'Actuar', value:'Actuar'},
	{type:'Habilidades Nobles', name:'Adivinacion', value:'Adivinacion'},
	{type:'Habilidades Nobles', name:'Arte: Bonsai', value:'Arte: Bonsai'},
	{type:'Habilidades Nobles', name:'Arte: Jardineria', value:'Arte: Jardineria'},
	{type:'Habilidades Nobles', name:'Arte: Ikebana', value:'Arte: Ikebana'},
	{type:'Habilidades Nobles', name:'Arte: Origami', value:'Arte: Origami'},	
	{type:'Habilidades Nobles', name:'Arte: Pintura', value:'Arte: Pintura'},	
	{type:'Habilidades Nobles', name:'Arte: Poesía', value:'Arte: Poesía'},	
	{type:'Habilidades Nobles', name:'Arte: Escritura', value:'Arte: Escritura'},	
	{type:'Habilidades Nobles', name:'Arte: Tatuajes', value:'Arte: Tatuajes'},	
	{type:'Habilidades Nobles', name:'Caligrafia', value:'Caligrafia'},
	{type:'Habilidades Nobles', name:'Ceremonia del Te', value:'Ceremonia del Te'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Anatomia', value:'Conocimiento: Anatomia'},
	{type:'Habilidades Nobles', name:'Conocimiento: Arquitectura', value:'Conocimiento: Arquitectura'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Bushido', value:'Conocimiento: Bushido'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Cultura Gaijin', value:'Conocimiento: Cultura Gaijin'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Cultura No-Humana', value:'Conocimiento: Cultura No-Humana'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Elementos', value:'Conocimiento: Elementos'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Fantasmas', value:'Conocimiento: Fantasmas'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Gran Clan', value:'Conocimiento: Gran Clan'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Guerra', value:'Conocimiento: Guerra'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Heraldica', value:'Conocimiento: Heraldica'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Historia', value:'Conocimiento: Historia'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Inframundo', value:'Conocimiento: Inframundo'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Maho', value:'Conocimiento: Maho'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Naturaleza', value:'Conocimiento: Naturaleza'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Presagios', value:'Conocimiento: Presagios'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Shugenjas', value:'Conocimiento: Shugenjas'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Reinos Espirituales', value:'Conocimiento: Reinos Espirituales'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Teologia', value:'Conocimiento: Teologia'},	
	{type:'Habilidades Nobles', name:'Conocimiento: Tierras Sombrias', value:'Conocimiento: Tierras Sombrias'},
	{type:'Habilidades Nobles', name:'Corte', value:'Corte'},	
	{type:'Habilidades Nobles', name:'Etiqueta', value:'Etiqueta'},
	{type:'Habilidades Nobles', name:'Hechiceria', value:'Hechiceria'},	
	{type:'Habilidades Nobles', name:'Interpretacion: Baile', value:'Interpretacion: Baile'},	
	{type:'Habilidades Nobles', name:'Interpretacion: Biwa', value:'Interpretacion: Biwa'},
	{type:'Habilidades Nobles', name:'Interpretacion: Cantar', value:'Interpretacion: Cantar'},	
	{type:'Habilidades Nobles', name:'Interpretacion: Flauta', value:'Interpretacion: Flauta'},	
	{type:'Habilidades Nobles', name:'Interpretacion: Oratoria', value:'Interpretacion: Oratoria'},	
	{type:'Habilidades Nobles', name:'Interpretacion: Marionetas', value:'Interpretacion: Marionetas'},
	{type:'Habilidades Nobles', name:'Interpretacion: Narracion', value:'Interpretacion: Narracion'},	
	{type:'Habilidades Nobles', name:'Interpretacion: Shamisen', value:'Interpretacion: Shamisen'},	
	{type:'Habilidades Nobles', name:'Interpretacion: Tambores', value:'Interpretacion: Tambores'},	
	{type:'Habilidades Nobles', name:'Investigacion', value:'Investigacion'},	
	{type:'Habilidades Nobles', name:'Medicina', value:'Medicina'},	
	{type:'Habilidades Nobles', name:'Meditacion', value:'Meditacion'},	
	{type:'Habilidades Nobles', name:'Pasatiempos: Fortunas y Vientos', value:'Pasatiempos: Fortunas y Vientos'},	
	{type:'Habilidades Nobles', name:'Pasatiempos: Go', value:'Pasatiempos: Go'},	
	{type:'Habilidades Nobles', name:'Pasatiempos: Kemari', value:'Pasatiempos: Kemari'},	
	{type:'Habilidades Nobles', name:'Pasatiempos: Correspondencia', value:'Pasatiempos: Correspondencia'},	
	{type:'Habilidades Nobles', name:'Pasatiempos: Sadane', value:'Pasatiempos: Sadane'},	
	{type:'Habilidades Nobles', name:'Pasatiempos: Shogi', value:'Pasatiempos: Shogi'},	
	{type:'Habilidades Nobles', name:'Sinceridad', value:'Sinceridad'},
	{type:'Habilidades Nobles', name:'Artesania: Forja', value:'Artesania: Forja'},
  ];
  
  // Lista auxiliar
  $scope.habilidadesArteEspList = [
	{type:'Habilidades de Arte', name:'Arte: Bonsai', value:'Arte: Bonsai'},
	{type:'Habilidades de Arte', name:'Arte: Jardineria', value:'Arte: Jardineria'},
	{type:'Habilidades de Arte', name:'Arte: Ikebana', value:'Arte: Ikebana'},
	{type:'Habilidades de Arte', name:'Arte: Origami', value:'Arte: Origami'},	
	{type:'Habilidades de Arte', name:'Arte: Pintura', value:'Arte: Pintura'},	
	{type:'Habilidades de Arte', name:'Arte: Poesía', value:'Arte: Poesía'},	
	{type:'Habilidades de Arte', name:'Arte: Escritura', value:'Arte: Escritura'},	
	{type:'Habilidades de Arte', name:'Arte: Tatuajes', value:'Arte: Tatuajes'}
  ];
  
  // Lista auxiliar
  $scope.habilidadesConocimientoEspList = [
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Anatomia', value:'Conocimiento: Anatomia'},
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Arquitectura', value:'Conocimiento: Arquitectura'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Bushido', value:'Conocimiento: Bushido'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Cultura Gaijin', value:'Conocimiento: Cultura Gaijin'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Cultura No-Humana', value:'Conocimiento: Cultura No-Humana'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Elementos', value:'Conocimiento: Elementos'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Fantasmas', value:'Conocimiento: Fantasmas'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Gran Clan', value:'Conocimiento: Gran Clan'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Guerra', value:'Conocimiento: Guerra'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Heraldica', value:'Conocimiento: Heraldica'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Historia', value:'Conocimiento: Historia'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Inframundo', value:'Conocimiento: Inframundo'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Maho', value:'Conocimiento: Maho'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Naturaleza', value:'Conocimiento: Naturaleza'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Presagios', value:'Conocimiento: Presagios'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Shugenjas', value:'Conocimiento: Shugenjas'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Reinos Espirituales', value:'Conocimiento: Reinos Espirituales'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Teologia', value:'Conocimiento: Teologia'},	
	{type:'Habilidades de Conocimiento', name:'Conocimiento: Tierras Sombrias', value:'Conocimiento: Tierras Sombrias'}
  ];

  // Ñista de habilidades bugei
  $scope.habilidadesBugeiList = [
	{type:'Habilidades Bugei', name:'Abanicos', value:'Abanicos'},
	{type:'Habilidades Bugei', name:'Armas de Asta', value:'Armas de Asta'},
	{type:'Habilidades Bugei', name:'Armas de Cadena', value:'Armas de Cadena'},
	{type:'Habilidades Bugei', name:'Armas Pesadas', value:'Armas Pesadas'},
	{type:'Habilidades Bugei', name:'Bastones', value:'Bastones'},	
	{type:'Habilidades Bugei', name:'Cuchillos', value:'Cuchillos'},	
	{type:'Habilidades Bugei', name:'Kenjutsu', value:'Kenjutsu'},	
	{type:'Habilidades Bugei', name:'Kyujutsu', value:'Kyujutsu'},	
	{type:'Habilidades Bugei', name:'Lanzas', value:'Lanzas'},	
	{type:'Habilidades Bugei', name:'Ninjitsu', value:'Ninjitsu'},	
	{type:'Habilidades Bugei', name:'Atletismo', value:'Atletismo'},	
	{type:'Habilidades Bugei', name:'Batalla', value:'Batalla'},	
	{type:'Habilidades Bugei', name:'Cazar', value:'Cazar'},	
	{type:'Habilidades Bugei', name:'Defensa', value:'Defensa'},	
	{type:'Habilidades Bugei', name:'Equitacion', value:'Equitacion'},	
	{type:'Habilidades Bugei', name:'Iaijutsu', value:'Iaijutsu'},	
	{type:'Habilidades Bugei', name:'Jiujitsu', value:'Jiujitsu'},
  ];
  
  // Lista auxiliar
  $scope.habilidadesArmasEspList = [
	{type:'Habilidades de Armas', name:'Abanicos', value:'Abanicos'},
	{type:'Habilidades de Armas', name:'Armas de Asta', value:'Armas de Asta'},
	{type:'Habilidades de Armas', name:'Armas de Cadena', value:'Armas de Cadena'},
	{type:'Habilidades de Armas', name:'Armas Pesadas', value:'Armas Pesadas'},
	{type:'Habilidades de Armas', name:'Bastones', value:'Bastones'},	
	{type:'Habilidades de Armas', name:'Cuchillos', value:'Cuchillos'},	
	{type:'Habilidades de Armas', name:'Kenjutsu', value:'Kenjutsu'},	
	{type:'Habilidades de Armas', name:'Kyujutsu', value:'Kyujutsu'},	
	{type:'Habilidades de Armas', name:'Lanzas', value:'Lanzas'},	
	{type:'Habilidades de Armas', name:'Ninjitsu', value:'Ninjitsu'}
  ];
	
  // Lista de habilidades Mescantiles
  $scope.habilidadesMercantilList = [
	{type:'Habilidades Mercantiles', name:'Artesania: Cocina', value:'Artesania: Cocina'},
	{type:'Habilidades Mercantiles', name:'Artesania: Herreria', value:'Artesania: Herreria'},	
	{type:'Habilidades Mercantiles', name:'Comercio', value:'Comercio'},	
	{type:'Habilidades Mercantiles', name:'Ingenieria', value:'Ingenieria'},	
	{type:'Habilidades Mercantiles', name:'Navegacion', value:'Navegacion'},	
	{type:'Habilidades Mercantiles', name:'Trato con Animales', value:'Trato con Animales'},
  ];
  
  // Lista auxiliar
  $scope.habilidadesArtesaniaInterpretacionEspList = [
	{type:'Habilidades de Interpretación', name:'Interpretacion: Baile', value:'Interpretacion: Baile'},	
	{type:'Habilidades de Interpretación', name:'Interpretacion: Biwa', value:'Interpretacion: Biwa'},
	{type:'Habilidades de Interpretación', name:'Interpretacion: Cantar', value:'Interpretacion: Cantar'},	
	{type:'Habilidades de Interpretación', name:'Interpretacion: Flauta', value:'Interpretacion: Flauta'},	
	{type:'Habilidades de Interpretación', name:'Interpretacion: Oratoria', value:'Interpretacion: Oratoria'},	
	{type:'Habilidades de Interpretación', name:'Interpretacion: Marionetas', value:'Interpretacion: Marionetas'},
	{type:'Habilidades de Interpretación', name:'Interpretacion: Narracion', value:'Interpretacion: Narracion'},	
	{type:'Habilidades de Interpretación', name:'Interpretacion: Shamisen', value:'Interpretacion: Shamisen'},	
	{type:'Habilidades de Interpretación', name:'Interpretacion: Tambores', value:'Interpretacion: Tambores'},	
	{type:'Habilidades de Artesania', name:'Artesania: Forja', value:'Artesania: Forja'},
	{type:'Habilidades de Artesania', name:'Artesania: Cocina', value:'Artesania: Cocina'},
	{type:'Habilidades de Artesania', name:'Artesania: Herreria', value:'Artesania: Herreria'},	
	{type:'Habilidades de Artesania', name:'Artesania: Venenos', value:'Artesania: Venenos'},
  ];

  // Lista de habilidades plebeyas
  $scope.habilidadesPlebeyaList = [
	{type:'Habilidades Plebeyas', name:'Artesania: Venenos', value:'Artesania: Venenos'},
	{type:'Habilidades Plebeyas', name:'Falsificacion', value:'Falsificacion'},	
	{type:'Habilidades Plebeyas', name:'Intimidacion', value:'Intimidacion'},	
	{type:'Habilidades Plebeyas', name:'Juego de Manos', value:'Juego de Manos'},	
	{type:'Habilidades Plebeyas', name:'Sigilo', value:'Sigilo'},	
	{type:'Habilidades Plebeyas', name:'Tentacion', value:'Tentacion'}	
  ];
  
  for (var i=1;i<24;i++) $scope["habilidadesList_"+i] = [{name:'Habilidad', value:'Habilidad'}].concat($scope.habilidadesNobleList).concat($scope.habilidadesBugeiList).concat($scope.habilidadesMercantilList).concat($scope.habilidadesPlebeyaList);
  
  // Lista de armaduras
  $scope.armadurasList = [
	{name:'Armadura', value:'Armadura'},	
	{name:'Ropa Normal', value:'Ropa Normal'},	
	{name:'Aishigaru', value:'Aishigaru'},
	{name:'Ligera', value:'Ligera'},	
	{name:'Pesada', value:'Pesada'},	
	{name:'Armadura de Jinete', value:'Armadura de Jinete'}
  ];
  
  // Lista de armas
  $scope.armasList = [
	{name:'Arma', value:'Arma'},
	{type:'Abanicos', name:'Abanico de Guerra', value:'Abanico de Guerra'}, 
	{type:'Armas de Asta', name:'Bisento', value:'Bisento'},
	{type:'Armas de Asta', name:'Nagamaki', value:'Nagamaki'},	
	{type:'Armas de Asta', name:'Naginata', value:'Naginata'},	
	{type:'Armas de Asta', name:'Sasumata', value:'Sasumata'},
	{type:'Armas de Asta', name:'Sodegarami', value:'Sodegarami'},	
	{type:'Armas de Cadena', name:'Kusarigama', value:'Kusarigama'}, 
	{type:'Armas de Cadena', name:'Kyoketsu-Shoge', value:'Kyoketsu-Shoge'},
	{type:'Armas de Cadena', name:'Manrikigusari', value:'Manrikigusari'},
	{type:'Ninjitsu', name:'Cerbatana', value:'Cerbatana'},
	{type:'Ninjitsu', name:'Shuriken', value:'Shuriken'},
	{type:'Ninjitsu', name:'Tsubute', value:'Tsubute'},
	{type:'Armas Pesadas', name:'Dai Tsuchi', value:'Dai Tsuchi'}, 
	{type:'Armas Pesadas', name:'Masakari', value:'Masakari'}, 
	{type:'Armas Pesadas', name:'Ono', value:'Ono'}, 	
	{type:'Armas Pesadas', name:'Tetsubo', value:'Tetsubo'}, 	
	{type:'Bastones', name:'Bo', value:'Bo'}, 
	{type:'Bastones', name:'Jo', value:'Jo'}, 	
	{type:'Bastones', name:'Machi-Kanshisha', value:'Machi-Kanshisha'}, 	
	{type:'Bastones', name:'Nunchaku', value:'Nunchaku'}, 	
	{type:'Bastones', name:'Sang Kauw - Espada', value:'Sang Kauw - Espada'}, 	
	{type:'Bastones', name:'Sang Kauw - Escudo', value:'Sang Kauw - Escudo'}, 	
	{type:'Bastones', name:'Tonfa', value:'Tonfa'}, 	
	{type:'Cuchillos', name:'Aiguchi', value:'Aiguchi'}, 	
	{type:'Cuchillos', name:'Jitte', value:'Jitte'},	
	{type:'Cuchillos', name:'Kama', value:'Kama'},	
	{type:'Cuchillos', name:'Sai', value:'Sai'},	
	{type:'Cuchillos', name:'Tanto', value:'Tanto'},	
	{type:'Kenjutsu', name:'Katana', value:'Katana'},	
	{type:'Kenjutsu', name:'Ninja-To', value:'Ninja-To'},	
	{type:'Kenjutsu', name:'No-Dachi', value:'No-Dachi'},	
	{type:'Kenjutsu', name:'Parangu', value:'Parangu'},
	{type:'Kenjutsu', name:'Cimitarra', value:'Cimitarra'},
	{type:'Kenjutsu', name:'Wakizashi', value:'Wakizashi'},	
	{type:'Lanzas', name:'Mai Chong', value:'Mai Chong'},	
	{type:'Lanzas', name:'Kumade', value:'Kumade'},	
	{type:'Lanzas', name:'Lanza de Caballería', value:'Lanza de Caballería'},	
	{type:'Lanzas', name:'Nage-Yari', value:'Nage-Yari'},	
	{type:'Lanzas', name:'Yari', value:'Yari'}
  ];
  
  // Lista de arcos
  $scope.arcosList = [
	{type: 'Arcos', name:"Dai-Kyu", value:"Dai-Kyu"},
	{type: 'Arcos', name:"Han-Kyu", value:"Han-Kyu"},
	{type: 'Arcos', name:"Yumi", value:"Yumi"}
  ];
  
  $scope.armas2List = $scope.armasList.concat($scope.arcosList);
  
  // Lista de flechas
  $scope.flechasList = [
	{name:'Flechas', value:'Flechas'},	
	{name:'Desgarracarne', value:'Desgarracarne'},	
	{name:'Cortacuerdas', value:'Cortacuerdas'},	
	{name:'Hoja de Sauce', value:'Hoja de Sauce'},	
	{name:'Perforarmaduras', value:'Perforarmaduras'},	
	{name:'Zumbadora', value:'Zumbadora'},	
  ];
  
  // Puebla la lista de familias dinámicamente en función del clan
  $scope.llenarFamilias = function () {
		if($scope.clan == "Clan") $scope.familiasList = [{name:"Familia", value:"Familia"}];
		else {
			var dataObj = {index : $scope.clan};

			var res = $http.post('/l5a/familias', dataObj);
			res.success(function(familias) {
				var arr = $.map(JSON.parse(angular.toJson(familias)), function(el) { return el });
				var familias = [];
				for (var key in arr) {
					if (arr[key] && arr[key] !== " ") familias.push ({name:arr[key], value:arr[key]});
				}
				$scope.familiasList = familias;
			});
			res.error(function(data, status) {
				alert("Ha fallado la petición. Estado HTTP:" + status);
			});
		}
	  }
 
 // Puebla la lista de escuelas dinámicamente en función del clan
 $scope.llenarEscuelas = function () {
	if($scope.clan == "Clan") $scope.escuelasList = [{name:"Escuela", value:"Escuela"}];
	else {
		var dataObj = {
				index : $scope.clan
		};
		
		var res = $http.post('/l5a/escuelas', dataObj);
		res.success(function(escuelas) {
			var arr = $.map(JSON.parse(angular.toJson(escuelas)), function(el) { return el });
			var escuelas = [];
			for (var key in arr) {
				if (arr[key] && arr[key] !== " ") escuelas.push ({name:arr[key], value:arr[key]});
			}
			$scope.escuelasList = escuelas;
		});
		res.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
	}
} 

  // Funciones que calculan los distintos campos de la ficha
  $scope.calcularCirculos = function () {
	$scope.tierra = Math.min($scope.resistencia, $scope.voluntad);
	$scope.aire = Math.min($scope.reflejos, $scope.consciencia);
	$scope.agua = Math.min($scope.fuerza, $scope.percepcion);
	$scope.fuego = Math.min($scope.agilidad, $scope.inteligencia);
	$scope.calcularEstiloVacio();
	$scope.calcularReconocimiento();
	$scope.calcularHabilidades();
  }
  
  $scope.calcularReconocimiento = function () {
	var aux = 0;
	for (var i=1;i<24;i++) if ($scope["rangoHabilidad_"+i] != null) aux += $scope["rangoHabilidad_"+i];
	$scope.reconocimiento = (($scope.tierra + $scope.aire + $scope.agua + $scope.fuego + $scope.vacio)*10) + aux;
	$scope.rango = parseInt(($scope.reconocimiento - 100) / 25);
	if ($scope.rango == 0) $scope.rango = 1;
  }
  
  $scope.calcularEstiloVacio = function () {
	for (var i=1;i<10;i++) {
		if (i<=$scope.vacio) $scope["vacioStyle_"+i] = {'background-color':'black'};
		else $scope["vacioStyle_"+i] = {'background-color':'none'};
	}
  }
  
  $scope.calcularHonor = function () {
	for (var i=1;i<11;i++) {
		if (i<=$scope.rangoHonor) $scope["honorStyle_"+i] = {'background-color':'black'};
		else $scope["honorStyle_"+i] = {'background-color':'none'};
	}
  }
  
  $scope.calcularGloria = function () {
	for (var i=1;i<11;i++) {
		if (i<=$scope.rangoGloria) $scope["gloriaStyle_"+i] = {'background-color':'black'};
		else $scope["gloriaStyle_"+i] = {'background-color':'none'};
	}
  }
  
  $scope.calcularStatus = function () {
	for (var i=1;i<11;i++) {
		if (i<=$scope.rangoStatus) $scope["statusStyle_"+i] = {'background-color':'black'};
		else $scope["statusStyle_"+i] = {'background-color':'none'};
	}
  }
  
  $scope.calcularMancha = function () {
	for (var i=1;i<11;i++) {
		if (i<=$scope.rangoMancha) $scope["manchaStyle_"+i] = {'background-color':'black'};
		else $scope["manchaStyle_"+i] = {'background-color':'none'};
	}
  }

  // Inicializa el cálculo de todos los datos
  $scope.calcularFicha = function() {
	var escuela = $scope.escuela;
	var familia = $scope.familia;
	
	if (escuela == "" || escuela == null || escuela=="Escuela" || familia == "" || familia == null || familia=="Familia") alert ("Por favor, complete Clan, Familia y Escuela");
	else {
		$scope.inicializarFicha();
		
		// Se crean los Json para las peticiones POST
		var dataFam = {index : $scope.familia};
		var dataEsc = {index : $scope.escuela};

		// Request POST para obtener el bonificador y el honor correspondiente a
		// la escuela
		var res = $http.post('/l5a/datos_escuela', dataEsc);
		res.success(function(data) {
			var arr = $.map(JSON.parse(angular.toJson(data)), function(el) { return el });
			$scope[arr[3]] += 1;
			$scope.rangoHonor = parseFloat(arr[2]);
			$scope.calcularHonor();
		});
		res.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
		
		// Request POST para obtener el bonificador de la familia
		var res2 = $http.post('/l5a/bonificadores_familia', dataFam);
		res2.success(function(data) {
			var arr = $.map(JSON.parse(angular.toJson(data)), function(el) { return el });
			$scope[arr[1]] += 1;
			$scope.calcularCirculos();
		});
		res2.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
		
		$scope.rangoGloria = 1;
		$scope.rangoStatus = 1;
		$scope.calcularGloria();
		$scope.calcularStatus();
		$scope.asignarHabilidades(); 
		document.querySelector("#calculoFicha").disabled="true";
	}
  }
  
  // Asigna habilidades según escuela
  $scope.asignarHabilidades = function() {
	var escuela = $scope.escuela;
	
	// Se crean los Json para las peticiones POST
	var dataEsc = {index : $scope.escuela};
	
	var res = $http.post('/l5a/datos_escuela', dataEsc);
	res.success(function(data) {
		var arr = $.map(JSON.parse(angular.toJson(data)), function(el) { return el });
		
		var bol = false;
		var habilidades = arr[5].split("//");
		var rangos = arr[4].split("//");
		var especialidades = arr[1].split("//");
		
		for (var i=1; i<8; i++){
			var aux = habilidades [i-1].split("#");
			if (aux[0] == "Bugei" || aux[0] == "Noble" || aux[0] == "Mercantil" || aux[0] == "Plebeya" || aux[0] == "Todas") {
				if (aux[0] != "Todas") {
					if (aux[1] == "Bugei" || aux[1] == "Noble" || aux[1] == "Mercantil" || aux[1] == "Plebeya") $scope["habilidadesList_"+i] = [{name:'Habilidad', value:'Habilidad'}].concat($scope["habilidades"+aux[0]+"List"]).concat($scope["habilidades"+aux[1]+"List"]);
					else if (aux[1] == null) $scope["habilidadesList_"+i] = [{name:'Habilidad', value:'Habilidad'}].concat($scope["habilidades"+aux[0]+"List"]);
					else if (aux[1] == "NoPlebeya") $scope["habilidadesList_"+i] = [{name:'Habilidad', value:'Habilidad'}].concat($scope.habilidadesNobleList).concat($scope.habilidadesBugeiList).concat($scope.habilidadesMercantilList);
					else if (aux[1] == "MercantilConocimiento") $scope["habilidadesList_"+i] = [{name:'Habilidad', value:'Habilidad'}].concat($scope.habilidadesMercantilList).concat($scope.habilidadesConocimientoEspList)
					else $scope["habilidadesList_"+i] = [{name:'Habilidad', value:'Habilidad'}].concat($scope["habilidades"+aux[1]+"List"]);
				}
				$scope["habilidadStyle_"+i] = {'background-color':'black'};
				bol = true;
			} else if (aux[0] == " ") {
				break;
			} else {
				$scope["habilidad_"+i] = aux[0];
				$scope["rangoHabilidad_"+i] = parseInt(rangos [i-1]);
				$scope["habilidadStyle_"+i] = {'background-color':'black'};
				$scope.pedirDatosHabilidad (i, especialidades [i-1]);
			}
		}
		if (bol) alert ("Alguna de las habilidades debe ser seleccionada por el usuario");
	});
	res.error(function(data, status) {
		alert("Ha fallado la petición. Estado HTTP:" + status);
	});
  }
  
  // Recupera los datos de cada habilidad de la base de datos
  $scope.pedirDatosHabilidad = function(j, esp) {
	  var dataHab = {index : $scope["habilidad_"+j]};
	  
	  var res = $http.post('/l5a/habilidades', dataHab);
	  res.success(function(data) {
		  var arr = $.map(JSON.parse(angular.toJson(data)), function(el) { return el });
		  
		  $scope["caracteristicaHabilidad_" + j] = arr[1];
		  var especialidad = arr[2].split("//");
			for (var i=0; i<especialidad.length; i++) {
				if (especialidad [i] !== " ") $scope["especialidadesList_"+j].push({name:especialidad [i], value:especialidad [i]});
				if ($scope["rangoHabilidad_"+j] == 0 || $scope["rangoHabilidad_"+j] == null) $scope["rangoHabilidad_"+j] = 1; 
				if (esp != " ") $scope["especialidadHabilidad_"+j] = esp;
			}
			$scope.calcularHabilidad (j);
	  });
	  res.error(function(data, status) {
		  alert("Ha fallado la petición. Estado HTTP:" + status);
	  });
  }
  
  // Calcula la armadura
  $scope.calcularArmadura = function () {
	if (armadura == "Armadura") {
		$scope.armBonif = 0;
		$scope.armNotas = "";
		$scope.reduccion = "";
	} else {
		var dataArm = {index : $scope.armTipo};
		
		var res = $http.post('/l5a/armaduras', dataArm);
		res.success(function(data) {
			var arr = $.map(JSON.parse(angular.toJson(data)), function(el) { return el });
		
			$scope.armBonif = parseInt(arr[3]);
			$scope.armNotas = arr[1];
			$scope.reduccion = parseInt(arr[0]);
		});
		res.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
	}
  }
  
  // Funciones que calculan los datos de las armas
  $scope.calcularArma1 = function () {	
	if ($scope.arma1Tipo == "Arma") {
		$scope.arma1Tirada = "";
		$scope.arma1X = 0;
		$scope.arma1Y = 0;
		$scope.arma1BonusX = 0;
		$scope.arma1BonusY = 0;
		$scope.arma1Notas = "";
	} else {	
		var dataArm = {index : $scope.arma1Tipo};
		
		var res = $http.post('/l5a/armas', dataArm);
		res.success(function(data) {
			var arr = $.map(JSON.parse(angular.toJson(data)), function(el) { return el });
			var ataque = arr[0].split("//");
			for (var i=1; i<24; i++){
				if (arr[3] == $scope["habilidad_"+i]) {
					$scope.arma1Tirada = $scope["tiradaHabilidad_"+i];
					$scope.arma1X = (parseInt(ataque[0]) + $scope.fuerza);
					$scope.arma1Y = parseInt(ataque[1]);
					$scope.arma1Notas = arr[1];
					break;
				} else {
					$scope.arma1Tirada = "Requiere " + arr[3];
					$scope.arma1X = 0;
					$scope.arma1Y = 0;
					$scope.arma1BonusX = 0;
					$scope.arma1BonusY = 0;
					$scope.arma1Notas = arr[1];
				}
			}
		});
		res.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
	}
  }
  
  $scope.calcularArma2 = function () {
	if ($scope.arma2Tipo == "Arma") {
		$scope.arma2Tirada = "";
		$scope.arma2X = 0;
		$scope.arma2Y = 0;
		$scope.arma2BonusX = 0;
		$scope.arma2BonusY = 0;
		$scope.arma2Notas = "";
	} else {	
		var dataArm = {index : $scope.arma2Tipo};
		
		var res = $http.post('/l5a/armas', dataArm);
		res.success(function(data) {
			var arr = $.map(JSON.parse(angular.toJson(data)), function(el) { return el });
			var ataque = arr[0].split("//");
			for (var i=1; i<24; i++){
				if (arr[3] == $scope["habilidad_"+i]) {
					$scope.arma2Tirada = $scope["tiradaHabilidad_"+i];
					if ($scope.arma2Tipo == "Dai-Kyu" || $scope.arma2Tipo == "Han-Kyu" || $scope.arma2Tipo == "Yumi") {
						$scope.arma2X = parseInt(ataque[0]);
						$scope.arma2Y = parseInt(ataque[1]);
						$scope.arma2Notas = arr[1];
						$scope.calcularFlechas();
						break;
					} else {
						$scope.arma2X = (parseInt(ataque[0]) + $scope.fuerza);
						$scope.arma2Y = parseInt(ataque[1]);
						$scope.arma2Notas = arr[1];
						break;
					}
				} else {
					$scope.arma2Tirada = "Requiere " + arr[3];
					$scope.arma2X = 0;
					$scope.arma2Y = 0;
					$scope.arma2BonusX = 0;
					$scope.arma2BonusY = 0;
					$scope.arma2Notas = arr[1];
				}
			}
		});
		res.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
	}
  }
	
  $scope.calcularFlecha = function (i) {	
	if ($scope["flechasTipo_"+i] == "Flechas") {
		$scope["flechasDano_"+i] = "";
		$scope["flechasCantidad_"+i] = 0;
	} else {
		var dataFle = {index : $scope["flechasTipo_"+i]};
		
		var res = $http.post('/l5a/flechas', dataFle);
		res.success(function(data) {
			var arr = $.map(JSON.parse(angular.toJson(data)), function(el) { return el });
			if (($scope.arma2Tipo == "Dai-Kyu" || $scope.arma2Tipo == "Han-Kyu" || $scope.arma2Tipo == "Yumi") && ($scope.arma2X != 0)) {
				var dañoFlecha = arr[1].split("//");
				$scope["flechasDano_"+i] = ($scope.arma2X + parseInt(dañoFlecha[0])) + "G" + ($scope.arma2Y + parseInt(dañoFlecha[1]));
			} else {
				$scope["flechasDano_"+i] = "Requiere un arco";
			}
		});
		res.error(function(data, status) {
			alert("Ha fallado la petición. Estado HTTP:" + status);
		});
	}
  }
  
  // Calculan los datos de las habilidades
  $scope.calcularHabilidades = function () {
	for (var i=1; i<24;i++) {
		if ($scope["habilidad_"+i] != "Habilidad" && $scope["rangoHabilidad_"+i] != null) $scope.calcularHabilidad(i);
	}
  }
  
  $scope.calcularHabilidad = function (i) {
	$scope["tiradaHabilidad_"+i] = ($scope["rangoHabilidad_"+i] + $scope[$scope["caracteristicaHabilidad_"+i].toLowerCase()]) + 'G' + $scope[$scope["caracteristicaHabilidad_"+i].toLowerCase()];
	$scope.calcularReconocimiento();
	$scope.calcularArmas();
  }
  
  $scope.calcularArmas = function () {
	if ($scope.arma1Tipo != "Arma") $scope.calcularArma1 ();
	if ($scope.arma2Tipo != "Arma") $scope.calcularArma2 ();
  }
  
  $scope.calcularFlechas = function () {
	if ($scope.arma2Tipo == "Dai-Kyu" || $scope.arma2Tipo == "Han-Kyu" || $scope.arma2Tipo == "Yumi") {
		for (var i=1;i<6;i++) $scope.calcularFlecha(i);
	}
  }
}]);