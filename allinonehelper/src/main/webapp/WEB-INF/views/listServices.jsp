<div class="container">
	<div class="row">

		<!-- display side bar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- display the actual products -->
		<div class="col-md-9">

			<!-- adding breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">
					<c:if test="${userClickAllServices == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/Home">Home</a></li>
							<li class="active breadcrumb-item">All Services</li>
						</ol>
					</c:if>
					
					<!-- userclick category services -->
					<c:if test="${userClickCategoryServices == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/Home">Home</a></li>
							<li class="active breadcrumb-item">Category</li>
								<li class="active breadcrumb-item">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>

</div>