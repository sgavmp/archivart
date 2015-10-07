var taskManagerModule = angular.module('taskManagerApp', ['ngAnimate']);

taskManagerModule.controller('taskManagerController', function ($scope,$http) {
	
	var urlBase="";
	$scope.selection = [];
	$scope.enumArte=['Pintura','Escultura','Arquitectura','Arte Efímero','Orfebrería']
	$scope.enumGenero=['Arte','Cultura','Economía','Política','Otros']
	$scope.enumTipoDocumento=['Poder','Contrato','Inventario','Testamento','Carta personal','Carta pública','Carta oficial','Otro']
	$scope.enumTranscrito=['Si','No','Parcialmente']
	$http.defaults.headers.post["Content-Type"] = "application/json";

    function findAllArchivos() {
        //get all files and display initially
        $http.get(urlBase + '/archivos/').
            success(function (data) {
                if (data._embedded != undefined) {
                    $scope.archivos = data._embedded.archivos;
                } else {
                    $scope.archivos = [];
                }
                $scope.accion="";
                $scope.arte="";
                $scope.destinoObra="";
                $scope.fecha="";
                $scope.fechaInventario="";
                $scope.fechaLimite="";
                $scope.firmante="";
                $scope.genero="";
                $scope.idioma="";
                $scope.nombre="";
                $scope.notario="";
                $scope.numReferencia="";
                $scope.observaciones="";
                $scope.otrasPersonas="";
                $scope.pagina="";
                $scope.receptor="";
                $scope.receptorAusente="";
                $scope.referencia="";
                $scope.testigos="";
                $scope.tipoDocumento="";
                $scope.transcrito="";
                
            });
    }

    findAllArchivos();

	//add a new task
	$scope.addTask = function addTask() {
		if($scope.fecha=="" || $	scope.nombre=="" || $scope.numReferencia == ""){
			alert("Insufficient Data! Please provide values for task name, description, priortiy and status");
		}
		else{
		 $http.post(urlBase + '/archivos', {
             name: $scope.name,
             fecha: $scope.numReferencia,
             numReferencia: $scope.numReferencia
         }).
		  success(function(data, status, headers) {
			 alert("Archivo añadido");
             var newTaskUri = headers()["location"];
             console.log("Might be good to GET " + newTaskUri + " and append the task.");
             // Refetching EVERYTHING every time can get expensive over time
             // Better solution would be to $http.get(headers()["location"]) and add it to the list
             findAllTasks();
		    });
		}
	};
		
	// toggle selection for a given task by task id
	  $scope.toggleSelection = function toggleSelection(taskUri) {
	    var idx = $scope.selection.indexOf(taskUri);

	    // is currently selected
        // HTTP PATCH to ACTIVE state
	    if (idx > -1) {
	      $http.patch(taskUri, { taskStatus: 'ACTIVE' }).
		  success(function(data) {
		      alert("Task unmarked");
              findAllTasks();
		    });
	      $scope.selection.splice(idx, 1);
	    }

	    // is newly selected
        // HTTP PATCH to COMPLETED state
	    else {
	      $http.patch(taskUri, { taskStatus: 'COMPLETED' }).
		  success(function(data) {
			  alert("Task marked completed");
              findAllTasks();
		    });
	      $scope.selection.push(taskUri);
	    }
	  };
	  
	
	// Archive Completed Tasks
	  $scope.archiveTasks = function archiveTasks() {
          $scope.selection.forEach(function(taskUri) {
              if (taskUri != undefined) {
                  $http.patch(taskUri, { taskArchived: 1});
              }
          });
          alert("Successfully Archived");
          console.log("It's risky to run this without confirming all the patches are done. when.js is great for that");
          findAllTasks();
	  };
	
});

//Angularjs Directive for confirm dialog box
taskManagerModule.directive('ngConfirmClick', [
	function(){
         return {
             link: function (scope, element, attr) {
                 var msg = attr.ngConfirmClick || "Are you sure?";
                 var clickAction = attr.confirmedClick;
                 element.bind('click',function (event) {
                     if ( window.confirm(msg) ) {
                         scope.$eval(clickAction);
                     }
                 });
             }
         };
 }]);