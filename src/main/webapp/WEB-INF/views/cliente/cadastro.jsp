<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<script src="<spring:url value='/js/jquery-2.1.4.min.js'/>" type="text/javascript"></script>
		<script src="<spring:url value='/js/bootstrap.js'/>" type="text/javascript"></script>
		<link href="<spring:url value='/css/bootstrap.css'/>" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<div class="container container-fluid">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-2">
					<div class="row">
						<form:form ng-controller="FormController" cssClass="form-horizontal" method="POST" modelAttribute="endereco" action="finalizar" name="cadastroForm">
							<div class="form-group">
								<h4 class="col-sm-offset-2 col-sm-10"><span class="label label-info">Dados para Entrega</span></h4>
							</div>
							<div class="form-group">
								<label for="nome" class="col-sm-2 control-label">Nome</label>
								<div class="col-sm-10">
									<input type="text" name="nome" id="nome" class="form-control" required>
								</div>
							</div>
							<div class="form-group">
								<label for="enderecoRua" class="col-sm-2 control-label">Endereço</label>
								<div class="col-sm-7">
									<input type="text" name="rua" id="rua" class="form-control" required>
								</div>
								<label for="enderecoNumero" class="col-sm-1 control-label">Número</label>
								<div class="col-sm-2">
									<input type="text" name="numero" id="numero" class="form-control" required>
								</div>
							</div>
							<div class="form-group">
								<label for="enderecoCep" class="col-sm-2 control-label">CEP</label>
								<div class="col-sm-2">
									<input type="text" name="cep" id="cep" class="form-control" required>
								</div>
								<label for="enderecoCidade" class="col-sm-1 control-label">Cidade</label>
								<div class="col-sm-3">
									<input type="text" name="cidade" id="cidade" class="form-control" required>
								</div>
								<label for="enderecoEstado" class="col-sm-1 control-label">Estado</label>
								<div class="col-sm-3">
									<input type="text" name="estado" id="estado" class="form-control" required>
								</div>
							</div>
							<hr/>
							<div class="form-group">
								<h4 class="col-sm-offset-2 col-sm-10"><span class="label label-info">Forma de Pagamento</span></h4>
							</div>
							<div class="form-group">
								<div class="col-lg-4 col-sm-offset-2">
									<div class="input-group">
										<span class="input-group-addon"> 
											<input type="radio" name="tipoPagamento" required>
										</span> 
										<label class="form-control">Dinheiro</label>
									</div>
								</div>
								<div class="col-lg-4">
									<div class="input-group">
										<span class="input-group-addon"> 
											<input type="radio" name="tipoPagamento" required>
										</span> 
										<label class="form-control">Cartão</label>
									</div>
								</div>
							</div>
							<div class="form-group pull-right">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-info">Enviar</button>
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
		<script src="<spring:url value='/js/angular.js'/>" type="text/javascript"></script>
	</body>
</html>