<template>
  <div id="app">
    <Layout>
      <Header class="theme_1 header"><MyHeader></MyHeader></Header>
      <Layout>
        <Sider class="leftList"><LeftList></LeftList></Sider>
        <Content>Content</Content>
      </Layout>
    </Layout>
  </div>
</template>

<script>
import LeftList from "@/components/LeftList";
import MyHeader from "@/components/MyHeader";

export default {
  name: 'App',
  components: {
    MyHeader,
    LeftList,
  }
}
</script>

<style>
div{
  width: 100%;
  height: 100%;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.theme_1{
  background-color: lightgreen!important;
}
.header{
  line-height: 20px !important;
}
.leftList{
  height: 100%;
}
</style>
